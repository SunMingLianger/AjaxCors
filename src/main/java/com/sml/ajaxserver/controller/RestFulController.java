package com.sml.ajaxserver.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 神迷的亮
 * 2018-05-24 17:48
 */
@Controller
@RequestMapping("/rest")
@Slf4j
public class RestFulController
{
    @GetMapping("/sun/{s}/{m}")
    @ResponseBody
    public String rest(@PathVariable("s") String s, @PathVariable("m") Integer m)
    {
        log.info("s = {}, m = {}", s, m);

        return "sml";
    }

}
