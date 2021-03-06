package com.mycloset.member.service;

import com.mycloset.member.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MemberService extends UserDetailsService {
    List<Member> findAll();
}
