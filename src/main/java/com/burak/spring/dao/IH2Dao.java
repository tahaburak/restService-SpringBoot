package com.burak.spring.dao;

import com.burak.spring.model.User;

import java.util.List;

/** Created by burak on 2019-05-16 */
public interface IH2Dao {
  void executeSql(String sql);

  void update(String sql, Object[] params);

  List<User> queryList(String sql);
}
