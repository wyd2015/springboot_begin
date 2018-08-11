package com.ethan.sb.begin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 这里使用@SpringBootApplication注解代替 @EnableAutoConfiguration + @ComponentScan 三个注解
 * 简化了对controller控制器的包路径扫描配置
 * 在启动类上使用@SpringBootApplication注解，默认扫描该类所在包，及其子包范围内的文件
 */
//@EnableAutoConfiguration
//@ComponentScan(basePackages = {"com.ethan.sb.begin.controller"})
@SpringBootApplication
public class SbBeginApplication {

	public static void main(String[] args) {
		//程序入口，此步启动项目，实例化内置的tomcat容器，并使用实例化后的tomcat容器加载springMVC
		SpringApplication.run(SbBeginApplication.class, args);
	}
}
