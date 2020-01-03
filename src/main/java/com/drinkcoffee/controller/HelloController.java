package com.drinkcoffee.controller;

import com.drinkcoffee.entity.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
@Slf4j
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
    @RequestMapping("/testMember")
    public Member testMember(){
        Member member = Member.builder().id(170218032333L).name("Skyzc").gender(1).build();
        log.info("测试一下" + member);
        return member;
    }
    @RequestMapping("/")
    public String thy(Model model){
        model.addAttribute("name","游正材");
        return "index";
    }
}