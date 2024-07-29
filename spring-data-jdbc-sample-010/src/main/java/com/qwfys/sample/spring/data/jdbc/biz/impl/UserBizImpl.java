package com.qwfys.sample.spring.data.jdbc.biz.impl;

import com.qwfys.sample.spring.data.jdbc.biz.spec.UserBiz;
import com.qwfys.sample.spring.data.jdbc.domain.UserRo;
import com.qwfys.sample.spring.data.jdbc.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserBizImpl implements UserBiz {
    private final UsersRepository usersRepository;

    @Override
    public List<UserRo> findAll() {
        return usersRepository.findAll();
    }
}
