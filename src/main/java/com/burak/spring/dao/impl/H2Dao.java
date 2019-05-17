package com.burak.spring.dao.impl;

import com.burak.spring.dao.IH2Dao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.stereotype.Service;

/** Created by burak on 2019-05-16 */
@Service
public class H2Dao extends NamedParameterJdbcDaoSupport implements IH2Dao {

  public H2Dao(JdbcTemplate jdbcTemplate) {
    setJdbcTemplate(jdbcTemplate);
  }

  @Override
  public void executeSql(String sql) {
    if (getJdbcTemplate() != null) {
      getJdbcTemplate().execute(sql);
    }
  }

  @Override
  public void update(String sql, Object[] params) {
    if (getJdbcTemplate() != null) {
      getJdbcTemplate().update(sql, params);
    }
  }
}
