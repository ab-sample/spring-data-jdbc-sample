package com.qwfys.sample.spring.data.jdbc.module.s099.biz.converter;

import com.qwfys.sample.spring.data.jdbc.module.s099.api.ao.*;
import com.qwfys.sample.spring.data.jdbc.module.s099.dal.domain.UserRo;
import com.qwfys.sample.spring.data.jdbc.module.s099.dal.domain.ext.UserDetailExt;
import com.qwfys.sample.spring.data.jdbc.module.s099.dal.domain.ext.UserListExt;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserConverter {

    UserDetailAo toUserDetailAo(UserDetailExt detailExt);

    UserListAo toUserListExt(UserListExt userListExt);

    UserRo toUserRo(UserAo userAo);

    UserRo toUserRo(UserSaveAo userUpdateAo);

    UserRo toUserRo(UserUpdateAo userUpdateAo);
}


