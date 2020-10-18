package com.myt.demo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: demo01
 * @description: spring boot应用启动类，通过它进行运行
 * @author: Ma YaTing
 * @create: 2020-10-18 11:03
 */
@SpringBootApplication //声明是一个springboot应用，该注解，可以带来spring boot自动配置等功能
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);//启动spring boot应用
    }
}
