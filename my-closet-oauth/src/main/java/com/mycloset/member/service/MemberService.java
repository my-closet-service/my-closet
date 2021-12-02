package com.mycloset.member.service;

import com.mycloset.member.entity.Member;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MemberService {
    List<Member> findAll();
}
