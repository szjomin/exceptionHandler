package com.jm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jm.entity.ResponseInfo;
import com.jm.service.TestService;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;


    @RequestMapping("/error")
    public ResponseInfo insertBolg(){
    	testService.test();
        return ResponseInfo.ok("yes...");

    }

}
