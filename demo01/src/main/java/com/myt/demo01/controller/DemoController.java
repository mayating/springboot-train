package com.myt.demo01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo01
 * @description: 提供http api
  @author: Ma YaTing
 * @create: 2020-10-18 11:03
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/echo")
    public String demo(){
        return "echo";
    }
}
