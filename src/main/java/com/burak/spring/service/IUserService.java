package com.burak.spring.service;

import com.burak.spring.model.User;

import java.util.List;

/**
 * Created by TCTAHKOC on 04/24/19
 */
public interface IUserService {
	User getDummyUser();

	User generateDummyUser();

	List<User> getUsers();

	List<User> generateDummyUsers(int numberOfUsers);

}
