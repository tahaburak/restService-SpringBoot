package com.burak.spring.restclient;

import com.burak.spring.model.User;
import com.burak.spring.util.Constants;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Created by burak on 05/16/19 */
@Service
public class JsonServerUserClient {
  private RestTemplate restTemplate;

  public JsonServerUserClient(RestTemplateBuilder restTemplateBuilder) {
    RestTemplate tmpRestTemplate = restTemplateBuilder.build();
    List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
    // Add the Jackson Message converter
    MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
    // Note: here we are making this converter to process any kind of response,
    // not only application/*json, which is the default behaviour
    converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
    messageConverters.add(converter);
    tmpRestTemplate.setMessageConverters(messageConverters);
    this.restTemplate = tmpRestTemplate;
  }

  public List<User> getUsers() {
    ResponseEntity<List<User>> responseEntity =
        restTemplate.exchange(
            Constants.JSON_SERVER_USERS,
            HttpMethod.GET,
            null,
            new ParameterizedTypeReference<List<User>>() {});
    return responseEntity.getBody();
  }
}
