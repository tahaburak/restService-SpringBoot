package com.burak.spring.service;

import com.burak.spring.dao.IUserDao;
import com.burak.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by TCTAHKOC on 04/24/19
 */
@Service
public class UserService implements IUserService {

	private final IUserDao userDao;

	@Autowired
	UserService(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User getDummyUser() {
		return userDao.getDummyUser();
	}

	@Override
	public User generateDummyUser() {
		return userDao.generateDummyUser();
	}

	@Override
	public List<User> getDummyUserList() {
		return userDao.getDummyUserList();
	}

	@Override
	public List<User> generateDummyUsers(int numberOfUsers) {
		return userDao.generateDummyUsers(numberOfUsers);
	}
}
