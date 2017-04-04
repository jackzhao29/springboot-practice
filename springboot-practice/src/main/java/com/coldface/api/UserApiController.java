package com.coldface.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coldface.bo.UserBo;
import com.google.common.collect.Maps;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
/**
 * 类UserBoController.java的实现描述：TODO 类实现描述
 * @author coldface
 * @date 2017年2月27日下午6:47:06
 */
@RestController
@RequestMapping(value="/outapi/users")
public class UserApiController {
  static Map<Long, UserBo> users =Maps.newConcurrentMap();

  @ApiOperation(value="获取用户列表", notes="")
  @RequestMapping(value={""}, method=RequestMethod.GET)
  public List<UserBo> getUserBoList() {
      List<UserBo> r = new ArrayList<UserBo>(users.values());
      return r;
  }

  @ApiOperation(value="创建用户", notes="根据UserBo对象创建用户")
  @ApiImplicitParam(name = "UserBo", value = "用户详细实体UserBo", required = true, dataType = "UserBo")
  @RequestMapping(value="", method=RequestMethod.POST)
  public String postUserBo(@RequestBody UserBo UserBo) {
      users.put(UserBo.getId(), UserBo);
      return "success";
  }

  @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
  @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
  @RequestMapping(value="/{id}", method=RequestMethod.GET)
  public UserBo getUserBo(@PathVariable Long id) {
      return users.get(id);
  }

  @ApiOperation(value="更新用户详细信息", notes="根据url的id来指定更新对象，并根据传过来的UserBo信息来更新用户详细信息")
  @ApiImplicitParams({
          @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long"),
          @ApiImplicitParam(name = "UserBo", value = "用户详细实体UserBo", required = true, dataType = "UserBo")
  })
  @RequestMapping(value="/{id}", method=RequestMethod.PUT)
  public String putUserBo(@PathVariable Long id, @RequestBody UserBo UserBo) {
      UserBo u = users.get(id);
      u.setName(UserBo.getName());
      u.setAge(UserBo.getAge());
      users.put(id, u);
      return "success";
  }

  @ApiOperation(value="删除用户", notes="根据url的id来指定删除对象")
  @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
  @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
  public String deleteUserBo(@PathVariable Long id) {
      users.remove(id);
      return "success";
  }
}
