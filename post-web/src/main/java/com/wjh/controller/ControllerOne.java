package com.wjh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerOne {

    @RequestMapping
    public String sayHello(){

        System.out.println("hahhahahasdkljsadl");
        return "success";
    }



}
