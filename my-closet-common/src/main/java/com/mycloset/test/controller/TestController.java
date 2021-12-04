package com.mycloset.test.controller;

import com.mycloset.test.entity.Test;
import com.mycloset.test.service.TestService;
import com.mycloset.util.ApiUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
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
    public ApiUtils.ApiResult<?> findAll() {
        return ApiUtils.success(testService.findAll());
    }

    @RequestMapping(value="/{seq}", method= RequestMethod.GET)
    public Test findById(@PathVariable("seq")Long seq) {
        return testService.findById(seq);
    }
}
