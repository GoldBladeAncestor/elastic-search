package com.elasticsearch.service;

import com.elasticsearch.domain.TestBean;

import java.util.List;

public interface TestService {
    Iterable<TestBean> findAll();

    void save(List<TestBean> list);

    void save(TestBean bean);

    List<TestBean> findByName(String text);

    List<TestBean> findByNameOrDesc(String name,String desc);
}
