package com.burak.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/** Created by burak on 03/19/19 */
@Configuration
public class SecurityPermitAllConfig extends WebSecurityConfigurerAdapter {
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests().anyRequest().permitAll().and().csrf().disable();
    http.headers().frameOptions().sameOrigin();
  }
}
