package com.qwfys.sample.spring.data.jdbc.module.s01.biz.business.impl;


import com.qwfys.sample.spring.data.jdbc.module.s01.api.ai.UserListAi;
import com.qwfys.sample.spring.data.jdbc.module.s01.api.ai.UserPageAi;
import com.qwfys.sample.spring.data.jdbc.module.s01.api.ao.UserDetailAo;
import com.qwfys.sample.spring.data.jdbc.module.s01.api.ao.UserListAo;
import com.qwfys.sample.spring.data.jdbc.module.s01.biz.business.spec.UsersBusiness;
import com.qwfys.sample.spring.data.jdbc.module.s01.dal.domain.UserRo;
import com.qwfys.sample.spring.data.jdbc.module.s01.dal.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UsersBusinessImpl implements UsersBusiness {

    private final UsersRepository usersRepository;


    @Override
    public boolean save(UserRo userSaveAo) {
        return false;
    }

    @Override
    public boolean removeById(Long id) {
        return false;
    }

    @Override
    public boolean update(UserRo userUpdateAo) {
        return false;
    }

    @Override
    public List<UserListAo> listBy(UserListAi userListAi) {
        return List.of();
    }

    @Override
    public UserDetailAo findById(Long id) {
        return null;
    }

    @Override
    public Page<UserListAo> pageBy(UserPageAi userPageAi) {
        return null;
    }
}
