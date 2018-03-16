package com.soecode.lyf.web;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 戴礼明
 * @Date 2018/3/16 15:46
 * @Description
 */

@RequestMapping("/")
public class HomeController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

}
