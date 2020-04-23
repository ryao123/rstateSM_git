package cn.service.users;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.pojo.Users;

public interface UsersService {
	//注册增加用户信息方法
	boolean addUsers(Users users);
	//登录
	Users loginUsers(String cardId, String password);
	
	//查询所有
	List<Users> getUsersList();
}
