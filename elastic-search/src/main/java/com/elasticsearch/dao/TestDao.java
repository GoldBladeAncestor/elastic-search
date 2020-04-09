package com.elasticsearch.dao;

import com.elasticsearch.domain.TestBean;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TestDao extends CrudRepository<TestBean, Long> {
    List<TestBean> findByName(String name);

    List<TestBean> findByNameOrDesc(String text, String desc);
}
