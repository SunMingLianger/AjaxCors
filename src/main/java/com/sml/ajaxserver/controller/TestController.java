package com.sml.ajaxserver.controller;

import com.sml.ajaxserver.pojo.ResultBean;
import com.sml.ajaxserver.pojo.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 神迷的亮
 * 2018-05-22 14:14
 */
@RestController
@RequestMapping("/test")
//@CrossOrigin 解决跨域问题
public class TestController
{
    @GetMapping("get1")
    public ResultBean get1()
    {
        System.out.println("TestController.get1()");
        return new ResultBean("get1 ok");
    }

    @PostMapping("/postjson")
    public ResultBean postJson(@RequestBody User user)
    //@cookieValue
    {
        System.out.println("Test22222");

        return new ResultBean("postJson" + user.getName());
    }

    @GetMapping("/getCookie")
    public ResultBean getCookie(@CookieValue("sml") String sml)
    {
        System.out.println("TestCOOKies");

        return new ResultBean("getCookie" + sml);
    }

    @GetMapping("/getHeader")
    public ResultBean getHeader(@RequestHeader("x-header1") String header1, @RequestHeader("x-header2") String header2)
    {
        System.out.println("getHead1+2");

        return new ResultBean("getheader" + header1 + "  " + header2);
    }

}
