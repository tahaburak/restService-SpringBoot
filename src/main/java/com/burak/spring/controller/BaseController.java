package com.burak.spring.controller;

import com.burak.spring.util.Constants;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/** Created by burak on 02/27/19 */
@RestController
@RequestMapping(Constants.CONTROLLER_PREFIX)
@Api(value = Constants.CONTROLLER_API_VALUE_BASE)
@Slf4j
public class BaseController {
  @GetMapping(value = Constants.REQUEST_MAP_VALUE_PING)
  @ResponseBody
  public String ping() {
    return "pong";
  }
}
