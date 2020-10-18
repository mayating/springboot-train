package com.myt.demo01.configue;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: demo01
 * @description: spring3.0开始提供Javaconfig的方式，进行spring bean的创建
 * @author: Ma YaTing
 * @create: 2020-10-18 13:29
 */
@Configuration //声明这是一个spring配置类
public class DemoConfiguration {

    @Bean //声明该方法创建一个spring bean
    public Object object(){
        return new Object();
    }
}
