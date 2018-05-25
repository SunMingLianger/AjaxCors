package com.sml.ajaxserver.controller;

import com.sml.ajaxserver.pojo.ResultBean;
import com.sml.ajaxserver.pojo.User;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

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

    public static void main(String[] args)
    {
        //MD5加密。使用spring core 提供的工具类
        String s = DigestUtils.md5DigestAsHex("邹地".getBytes());

        //base64加密
        String s1 = Base64.getEncoder().encodeToString("孙明亮".getBytes(StandardCharsets.UTF_8));
        System.out.println(s1);

        String s2 = new String(Base64.getDecoder().decode(s1.getBytes()), StandardCharsets.UTF_8);

        System.out.println(s2);

    }
}
