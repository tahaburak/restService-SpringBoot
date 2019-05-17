package com.burak.spring.util;

import com.burak.spring.exception.CustomException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/** Created by burak on 03/07/19 */
@Slf4j
public class CustomStringUtil {
  private CustomStringUtil() {
    //
  }

  public static String convertObjectToJson(Object o) throws CustomException {
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    objectMapper.writer().withDefaultPrettyPrinter();
    String result;
    try {
      result = objectMapper.writeValueAsString(o);
    } catch (Exception e) {
      throw new CustomException(e);
    }
    return result;
  }
}
