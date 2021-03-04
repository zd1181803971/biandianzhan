package com.dzu.sourcecode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Classname indexController
 * @Description TODO
 * @Date 2021/3/3 20:47
 * @Created by ZhaoDong
 */
@Controller
public class indexController {


    @GetMapping("/")
    public String index(){
        System.out.println("1111");
        return "redirect:biandianzhan.html";
    }

}
