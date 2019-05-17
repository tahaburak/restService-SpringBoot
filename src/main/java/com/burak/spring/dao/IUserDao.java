package com.burak.spring.dao;

import com.burak.spring.model.User;

import java.util.List;

/** Created by burak on 04/24/19 */
public interface IUserDao {

  User generateDummyUser();

  User getDummyUser();

  List<User> getDummyUserList();

  List<User> generateDummyUsers(int numberOfUsers);
}
