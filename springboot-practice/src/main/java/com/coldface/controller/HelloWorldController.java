package com.coldface.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @RequestMapping("/")
  public String sayHello(){
    return "Hello,World";
  }
  
  @RequestMapping("/springboot")
  public String say(){
    return "Hi,Spring Boot";
  }
}
