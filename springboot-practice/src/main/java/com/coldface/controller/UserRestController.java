package com.coldface.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coldface.bo.UserBo;
import com.coldface.service.UserService;

/**
 * 类UserRestController.java的实现描述：用户Controller实现Resultful HTTP服务
 * @author coldface
 * @date 2017年2月24日下午3:18:04
 */
@RestController
public class UserRestController {
  @Autowired
  private UserService userService;
  
  @RequestMapping(value="/api/user/{name}",method = RequestMethod.GET)
  public UserBo findOneUser(@PathVariable("name") String name){
    return userService.findUserByName(name);
  }
  
  @RequestMapping(value="/api/user/all",method = RequestMethod.GET)
  public List<UserBo> findAllUser(){
    return userService.findAllUser();
  }
  
  @RequestMapping(value="/api/user",method = RequestMethod.POST)
  public void saveUser(@RequestBody UserBo userBo){
     userService.saveUser(userBo);
  }
  
  @RequestMapping(value="/api/user",method = RequestMethod.PUT)
  public void modifyUser(@RequestBody UserBo userBo){
    userService.updateUser(userBo);
  }
  
  @RequestMapping(value="/api/user/{id}",method = RequestMethod.DELETE)
  public void deleteUser(@PathVariable("id") Long id){
    userService.deleteUserById(id);
  }
  
  
}
