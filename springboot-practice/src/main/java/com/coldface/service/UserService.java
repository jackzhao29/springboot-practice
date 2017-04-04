package com.coldface.service;

import java.util.List;

import com.coldface.bo.UserBo;

/**
 * 类UserService.java的实现描述：用户业务逻辑接口类
 * @author coldface
 * @date 2017年2月22日上午11:50:05
 */
public interface UserService {
  
  /**
   * 根据用户名称，查询用户信息
   * @author coldface
   * @date 2017年2月22日上午11:51:06
   * @param name
   * @return
   */
  UserBo findUserByName(String name);
  
  /**
   * 查询全部用户信息
   * @author coldface
   * @date 2017年2月24日下午3:23:19
   * @return
   */
  List<UserBo> findAllUser();
  
  /**
   * 保存用户信息
   * @author coldface
   * @date 2017年2月24日下午4:22:14
   * @param userBo
   */
  void saveUser(UserBo userBo);

  /**
   * 更新用户信息
   * @author coldface
   * @date 2017年2月24日下午4:22:24
   * @param userBo
   */
  void updateUser(UserBo userBo);
  
  /**
   * 根据用户ID删除用户信息
   * @author coldface
   * @date 2017年2月24日下午4:22:31
   * @param id
   */
  void deleteUserById(Long id);

}
