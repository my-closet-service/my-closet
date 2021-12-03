package com.mycloset.test.repository;

import com.mycloset.test.entity.Test;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends CrudRepository<Test, Long> {
    @Override
    List<Test> findAll();
}
