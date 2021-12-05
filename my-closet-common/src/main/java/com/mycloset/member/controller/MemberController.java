package com.mycloset.member.controller;

import com.mycloset.member.service.MemberService;
import com.mycloset.util.ApiUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping(method = RequestMethod.GET)
    public ApiUtils.ApiResult<?> findAll() {
        return ApiUtils.success(memberService.findAll());
    }
}
