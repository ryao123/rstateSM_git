package cn.service.estate.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cn.dao.EstateDao;
import cn.service.estate.EstateService;
@Service("estateService")
public class EstateServiceImpl implements EstateService {

	@Autowired
	@Qualifier("estateDao")
	private EstateDao estateDao;
	
	//∑÷“≥∫Õœ‘ æ
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return estateDao.getCount();
	}

	@Override
	public List getPageLists(String type,String query,int from, int pageSize) {
		// TODO Auto-generated method stub
		return estateDao.getPageLists(type,query,from, pageSize);
	}

}
