package cn.service.estate;

import java.util.List;

public interface EstateService {
	//��ʾͼ��ӷ�ҳ
		int getCount();
		List getPageLists(String type,String query,int from, int pageSize);
}
