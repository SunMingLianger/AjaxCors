package com.sml.ajaxserver.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

/**
 * jsonp的跨域请求，后台的相应配置
 * Created by 神迷的亮
 * 2018-05-22 15:06
 */
@ControllerAdvice
public class JsonAdvice extends AbstractJsonpResponseBodyAdvice
{
    public JsonAdvice()
    {
        super("callback");
    }
}
