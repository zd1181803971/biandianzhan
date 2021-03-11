package com.dzu.sourcecode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;

/**
 * @Classname indexController
 * @Description TODO
 * @Date 2021/3/3 20:47
 * @Created by ZhaoDong
 */
@Controller
public class indexController {

    @Autowired
    private DataSource dataSource;

    @ResponseBody
    @GetMapping("/sql")
    public void test(){
        System.out.println(dataSource.getClass());
    }

    @GetMapping("/")
    public String index(){
        System.out.println("1111");
        return "redirect:biandianzhan.html";
    }

}
