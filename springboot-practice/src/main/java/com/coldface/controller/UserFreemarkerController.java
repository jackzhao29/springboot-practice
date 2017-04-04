package com.coldface.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coldface.bo.UserBo;
import com.coldface.service.UserService;

/**
 * 类UserFreemarkerController.java的实现描述：Freemarker控制器类
 * @author coldface
 * @date 2017年2月27日上午10:16:07
 */
@Controller
@RequestMapping(value="/freemarker")
public class UserFreemarkerController {

  @Autowired
  private UserService userService;
  
  @RequestMapping(value = "/user/{name}", method = RequestMethod.GET)
  public String findOneUser(Model model, @PathVariable("name") String name){
    UserBo userBo=userService.findUserByName(name);
    model.addAttribute("userbo", userBo);
    return "user";
  }
  
  @RequestMapping(value = "/users", method = RequestMethod.GET)
  public String findUserList(Model model){
    List<UserBo> userBoList=userService.findAllUser();
    model.addAttribute("userList", userBoList);
    return "userList";
  }
}
