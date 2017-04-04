package com.coldface.bo;

/**
 * 类UserBo.java的实现描述：用户实体类
 * 
 * @author coldface
 * @date 2017年2月22日上午11:46:28
 */
public class UserBo {

  private Long id;
  private String name;
  private Integer age;
  private Integer type;
  private String phone;
  private String address;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


}
