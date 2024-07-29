package com.qwfys.sample.spring.data.jdbc.module.s099.biz.business.spec;


import com.qwfys.sample.spring.data.jdbc.module.s099.api.ai.UserListAi;
import com.qwfys.sample.spring.data.jdbc.module.s099.api.ai.UserPageAi;
import com.qwfys.sample.spring.data.jdbc.module.s099.api.ao.UserDetailAo;
import com.qwfys.sample.spring.data.jdbc.module.s099.api.ao.UserListAo;
import com.qwfys.sample.spring.data.jdbc.module.s099.dal.domain.UserRo;
import org.springframework.data.domain.Page;

import java.util.List;


public interface UsersBusiness {

    boolean save(UserRo userSaveAo);

    boolean removeById(Long id);

    boolean update(UserRo userUpdateAo);

    List<UserListAo> listBy(UserListAi userListAi);

    UserDetailAo findById(Long id);

    Page<UserListAo> pageBy(UserPageAi userPageAi);
}
