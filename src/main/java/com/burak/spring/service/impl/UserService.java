package com.burak.spring.service.impl;

import com.burak.spring.dao.IUserDao;
import com.burak.spring.exception.CustomException;
import com.burak.spring.model.User;
import com.burak.spring.restclient.JsonServerUserClient;
import com.burak.spring.service.IDummyService;
import com.burak.spring.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by burak on 04/24/19
 */
@Service
public class UserService implements IUserService {

	private final IUserDao userDao;
	private final JsonServerUserClient jsonServerUserClient;
	private final IDummyService dummyService;

	@Autowired
	UserService(IUserDao userDao, JsonServerUserClient jsonServerUserClient, IDummyService dummyService) {
		this.userDao = userDao;
		this.jsonServerUserClient = jsonServerUserClient;
		this.dummyService = dummyService;
	}

	@Override
	public User getDummyUser() {
		return dummyService.getDummyUser();
	}

	@Override
	public User generateDummyUser() {
		return dummyService.generateDummyUser();
	}

	@Override
	public List<User> getUsers() {
		List<User> users;
		try {
			users = jsonServerUserClient.getUsers();
			if (CollectionUtils.isEmpty(users)) {
				throw new CustomException("");
			}
			//		users.stream().filter(user -> )
		} catch (Exception e) {
			try {
				users = userDao.getUsers();
			} catch (Exception ex) {
				users = dummyService.getDummyUserList();
			}
		}

		return users;
	}

	@Override
	public List<User> generateDummyUsers(int numberOfUsers) {
		return dummyService.generateDummyUsers(numberOfUsers);
	}
}
