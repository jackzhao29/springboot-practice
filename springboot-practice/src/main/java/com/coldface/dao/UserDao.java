package com.coldface.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.coldface.bo.UserBo;

/**
 * 类UserDao.java的实现描述：用户 DAO接口类
 * @author coldface
 * @date 2017年2月22日上午11:45:58
 */
public interface UserDao {
  
  /**
   * 根据用户名称，查询用户信息
   * @author coldface
   * @date 2017年2月22日上午11:47:13
   * @param name
   * @return
   */
  UserBo findUserByName(@Param("name") String name);
  
  /**
   * 查询全部用户信息
   * @author coldface
   * @date 2017年2月24日下午3:22:24
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
