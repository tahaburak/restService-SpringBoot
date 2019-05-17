package com.burak.spring.controller;

import com.burak.spring.util.Constants;
import com.github.javafaker.Faker;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;
import java.util.Random;

/** Created by burak on 02/27/19 */
@RestController
@RequestMapping(Constants.CONTROLLER_PREFIX)
@Api(value = Constants.CONTROLLER_API_VALUE_GREETING)
@Slf4j
public class GreetingController {

  private final Faker faker = new Faker(new Locale("en"));

  @GetMapping(value = Constants.REQUEST_MAP_VALUE_HIGH_FIVE)
  @ResponseBody
  public String highFive() {
    return faker.howIMetYourMother().highFive();
  }

  @GetMapping(value = Constants.REQUEST_MAP_VALUE_QUOTE)
  @ResponseBody
  public String quote() {
    return new Random().nextBoolean() ? faker.howIMetYourMother().quote() : faker.friends().quote();
  }
}
