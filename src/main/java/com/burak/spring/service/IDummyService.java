package com.burak.spring.service;

import com.burak.spring.model.User;

import java.util.List;

/**
 * Created by burak on 05/17/19
 */
public interface IDummyService {
	User generateDummyUser();

	User getDummyUser();

	List<User> getDummyUserList();

	List<User> generateDummyUsers(int numberOfUsers);
}
