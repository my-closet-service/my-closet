package com.mycloset.member.repository;

import com.mycloset.member.entity.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends CrudRepository<Member, String> {

    @Override
    List<Member> findAll();
}
