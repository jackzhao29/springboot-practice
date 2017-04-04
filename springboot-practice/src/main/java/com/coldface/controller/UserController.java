package com.coldface.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coldface.bo.UserBo;
import com.coldface.service.UserService;

@RestController
public class UserController {
  @Autowired
  private UserService userService;
  
  @RequestMapping(value="/api/user",method = RequestMethod.GET)
  public UserBo findOneUser(@RequestParam(value = "name", required = true) String name){
    return userService.findUserByName(name);
  }
}
