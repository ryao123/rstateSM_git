package cn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;


import cn.pojo.Users;

public interface UsersDao {
	
	//ע�������û���Ϣ����
	boolean addUsers(Users users);
	//��¼
	Users loginUsers(@Param("cardId") String cardId,@Param("password") String password);
	
	//��ѯ����
	List<Users> getUsersList();
	
}
