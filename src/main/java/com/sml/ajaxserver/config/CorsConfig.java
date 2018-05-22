package com.sml.ajaxserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * 后台配置跨域
 * C cross  O  origin   域  ， R resource  ，S sharing
 * Created by 神迷的亮
 * 2018-05-16 17:46
 */
@Configuration
public class CorsConfig
{
    @Bean
    public CorsFilter corsFilter()
    {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

        CorsConfiguration corsConfiguration = new CorsConfiguration();

        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.addAllowedMethod("*");

        // enable cookie
        corsConfiguration.setAllowCredentials(true);
        //设置ajax跨域的预检命令缓存起来，针对发送json过来的请求。如果是非简单请求，它会发送一个预检命令，检查通过之后，才会吧请求发送过去，所以你会看到二次请求
        //
        //		第一次请求为options,预检命令方法，不带返回值回来，第二次才正式发送接收请求相应
        corsConfiguration.setMaxAge(3600L);
        source.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsFilter(source);
    }
}
