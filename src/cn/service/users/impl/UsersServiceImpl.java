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
	
	//ע�������û���Ϣ����
	@Override
	public boolean addUsers(Users users) {
		// TODO Auto-generated method stub
		return usersDao.addUsers(users);
	}
	
	//��¼��ѯ
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
