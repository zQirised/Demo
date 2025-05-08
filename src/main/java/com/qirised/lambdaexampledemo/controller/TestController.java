package com.qirised.lambdaexampledemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : qirised
 * @description :
 * @Version:
 **/
@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/hello")
    public String hello()
    {
        System.out.println("Hello world");
        return "hello world";
    }
}
