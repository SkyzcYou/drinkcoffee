package com.drinkcoffee.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: skyzc
 * Date: 2020/1/2
 * Time: 23:51
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
public class HelloController {
    @RequestMapping
    public String hello(){
        return "Hello World";
    }
}