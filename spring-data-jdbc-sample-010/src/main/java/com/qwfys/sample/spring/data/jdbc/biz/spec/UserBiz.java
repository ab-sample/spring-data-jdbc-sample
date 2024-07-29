package com.qwfys.sample.spring.data.jdbc.biz.spec;

import com.qwfys.sample.spring.data.jdbc.domain.UserRo;

import java.util.List;

public interface UserBiz {
    List<UserRo> findAll();
}
