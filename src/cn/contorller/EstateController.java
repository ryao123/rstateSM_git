package cn.contorller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.pojo.Pager;
import cn.pojo.Users;
import cn.service.estate.EstateService;
import cn.service.users.UsersService;

/**
 * Servlet implementation class EstateController
 */
@WebServlet("/EstateController")
public class EstateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//���ApplicationContext����
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		EstateService es=(EstateService) ctx.getBean("estateService");
		UsersService us=(UsersService) ctx.getBean("usersService");
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EstateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		String op=req.getParameter("op");
		if("estateList".equals(op)) {
			estateList(req,resp);
		}
	}


	private void estateList(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		
		//��õ�ǰҳ��ҳ��
		String pageIndex=req.getParameter("pageIndex");
		//���ҳ��ֵ
		//int type=Integer.parseInt(req.getParameter("type"));
		String type=req.getParameter("type");
		String query=req.getParameter("query");
		System.out.println("ȥ�ó���"+query);
		//�����ǰҳ�ǿյģ���ʹ���������
		int currpage=1;
		//����ҳ������
		Pager pg=new Pager();
		//�������������
		int totalCount=es.getCount();
		pg.setTotalCount(totalCount);
		if (pageIndex==null || "".equals(pageIndex)) {
			currpage=1;
		}else{
			int pIndex=Integer.parseInt(pageIndex);
			if (pIndex<=0) {
				currpage=1;
			}else if (pIndex>pg.getTotalPages()) {
				currpage=pg.getTotalPages();
			}else {
				currpage=pIndex;
			}
		}
		pg.setCurrPage(currpage);
		//�����￪ʼ��ѯ   ����ǵ�һҳ   (1-1)*��ʾ����������   ��0��ʼ��ѯ
		int from=(currpage-1)*pg.getPageSize();
		List pageLists=es.getPageLists(type,query,from,pg.getPageSize());
		pg.setPageLists(pageLists);
		List<Users> ulist=us.getUsersList();
		if (pageLists!=null) {
			req.getSession().setAttribute("pg", pg);
			req.getSession().setAttribute("ulist",ulist);
			resp.sendRedirect("index.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
