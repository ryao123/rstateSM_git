package cn.service.users;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.pojo.Users;

public interface UsersService {
	//ע�������û���Ϣ����
	boolean addUsers(Users users);
	//��¼
	Users loginUsers(String cardId, String password);
	
	//��ѯ����
	List<Users> getUsersList();
}
