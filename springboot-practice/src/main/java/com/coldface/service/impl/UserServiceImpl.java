package com.coldface.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coldface.bo.UserBo;
import com.coldface.dao.UserDao;
import com.coldface.service.UserService;

/**
 * 类UserServiceImpl.java的实现描述：用户业务逻辑实现类
 * @author coldface
 * @date 2017年2月22日上午11:51:57
 */
@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserDao userDao;
  /* (non-Javadoc)
   * @see com.coldface.service.UserService#findUserByName(java.lang.String)
   */
  public UserBo findUserByName(String name) {
    // TODO Auto-generated method stub
    return userDao.findUserByName(name);
  }
  
  public List<UserBo> findAllUser(){
    return userDao.findAllUser();
  }
  
  
  public void saveUser(UserBo userBo){
    userDao.saveUser(userBo);
  }

  
  public void updateUser(UserBo userBo){
    userDao.updateUser(userBo);
  }
  
  
  public void deleteUserById(Long id){
    userDao.deleteUserById(id);
  }

}
