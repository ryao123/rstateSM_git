package cn.contorller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mysql.jdbc.StringUtils;

import cn.pojo.Users;
import cn.service.users.UsersService;

/**
 * Servlet implementation class UserBookController
 */
@WebServlet("/UsersController")
public class UsersController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//获得ApplicationContext对象
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
	UsersService us=(UsersService) ctx.getBean("usersService");
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsersController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		String op=req.getParameter("op");
		if("add".equals(op)) {
			addUsers(req,resp);
		}else if ("login".equals(op)) {
			login(req,resp);
		}else if ("loginout".equals(op)) {
			loginout(req,resp);
		}
		
	}

	
	
	private void loginout(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getSession().removeAttribute("cardId");
		resp.sendRedirect("login.jsp");
	}

	private void login(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
	
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		UsersService us=(UsersService) ctx.getBean("usersService");
		//获得页面数据
		String cardId=req.getParameter("cardId");
		String password=req.getParameter("password");
		Users users=new Users(cardId, password);
		Users isOk=us.loginUsers(cardId, password);
		if(isOk !=null) {
			//登录
			req.getSession().setAttribute("users", isOk);
			resp.sendRedirect("EstateController?op=estateList");
		}else {
			resp.sendRedirect("login.jsp");
		}
	}

	private void addUsers(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {

		//获得页面数据
		String cardId=req.getParameter("cardId");
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		Users users=new Users(cardId, name, password);
		boolean isOk=us.addUsers(users);
		resp.sendRedirect("login.jsp");
		
	}

	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

	
}
