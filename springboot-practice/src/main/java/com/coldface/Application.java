package com.coldface;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 类Application.java的实现描述：Spring Boot应用启动类
 * 
 * @author coldface
 * @date 2017年2月21日上午10:07:58
 */
@SpringBootApplication
// mapper 接口类扫描包配置
@MapperScan("com.coldface.dao")
public class Application {

  public static void main(String[] args) {
    // 程序启动入口,启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
    SpringApplication.run(Application.class, args);
  }

}
