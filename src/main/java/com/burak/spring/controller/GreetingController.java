package com.burak.spring.controller;

import com.burak.spring.util.Constants;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by TCTAHKOC on 02/27/19
 */
@RestController
@RequestMapping(Constants.CONTROLLER_PREFIX)
@Api(value = Constants.CONTROLLER_API_VALUE_GREETING)
@Slf4j
public class GreetingController {

}
