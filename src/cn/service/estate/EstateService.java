package cn.service.estate;

import java.util.List;

public interface EstateService {
	//显示图书加分页
		int getCount();
		List getPageLists(String type,String query,int from, int pageSize);
}
