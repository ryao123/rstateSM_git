package cn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;


import cn.pojo.Estate;
import sun.font.EAttribute;

public interface EstateDao {
	//∑÷“≥º”œ‘ æ
	int getCount();
	List<Estate> getPageLists(@Param("type") String type,@Param("query") String query,@Param("from") int currPage,@Param("pageSize") int pageSize);
	
	
}
