//package com.sml.ajaxserver.filter;
//
//import javax.servlet.*;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * Created by 神迷的亮
// * 2018-05-22 15:58
// */
//public class CrosFilter implements javax.servlet.Filter
//{
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException
//    {
//
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException
//    {
//        HttpServletRequest request = (HttpServletRequest) servletRequest;
//
//        HttpServletResponse response = (HttpServletResponse) servletResponse;
//
//        response.addHeader("Access-Control-Allow-Origin", "http://localhost:8081");
//        response.addHeader("Access-Control-Allow-Methods", "*");
//
//        filterChain.doFilter(request, response);
//    }
//
//    @Override
//    public void destroy()
//    {
//
//    }
//}
