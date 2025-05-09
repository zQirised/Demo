package com.qirised.lambdaexampledemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : qirised
 * @description :
 * @Version:
 **/
@RestController("/demo")
public class DemoController {
    @GetMapping("/world")
    public String world() {
        return "Hello World";
    }
}
