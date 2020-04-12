package com.yuanchun.zuul.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class TestController  {
    @Value("${zuul.add-host-header}")
    private String eilriis;

    @RequestMapping("/testZuul")
    public Object error(HttpServletRequest request, HttpServletResponse response) {
        return "this is getway testZuul AND zuul.add-host-header: " + eilriis;
    }
}