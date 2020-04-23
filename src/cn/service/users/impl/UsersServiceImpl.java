package cn.service.users.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cn.dao.UsersDao;
import cn.pojo.Users;
import cn.service.users.UsersService;

@Service("usersService")
public class UsersServiceImpl implements UsersService {

	
	@Autowired
	@Qualifier("usersDao")
	private UsersDao usersDao;
	
	//注册增加用户信息方法
	@Override
	public boolean addUsers(Users users) {
		// TODO Auto-generated method stub
		return usersDao.addUsers(users);
	}
	
	//登录查询
	@Override
	public Users loginUsers(String cardId, String password) {
		// TODO Auto-generated method stub
		return usersDao.loginUsers(cardId, password);
	}

	@Override
	public List<Users> getUsersList() {
		// TODO Auto-generated method stub
		return usersDao.getUsersList();
	}

}
