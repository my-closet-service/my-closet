package com.mycloset.test.controller;

import com.mycloset.test.entity.Test;
import com.mycloset.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping(method= RequestMethod.GET)
    public List<Test> findAll() {
        return testService.findAll();
    }
}
