package com.coldface.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 类UserThymeleafController.java的实现描述：TODO 类实现描述
 * @author coldfae
 * @date 2017年2月27日下午4:42:05
 */
@Controller
@RequestMapping(value = "/thymeleaf")
public class UserThymeleafController {
  
  @RequestMapping(value = "/index")
  public String index(ModelMap model){
    model.addAttribute("name", "Thymeleaf");
    return "index";
  }

}
