package com.qwfys.sample.spring.data.jdbc.module.s01.api.controller;

import com.qwfys.sample.spring.data.jdbc.common.validater.SaveGroup;
import com.qwfys.sample.spring.data.jdbc.common.validater.UpdateGroup;
import com.qwfys.sample.spring.data.jdbc.module.s01.api.ai.UserListAi;
import com.qwfys.sample.spring.data.jdbc.module.s01.api.ai.UserPageAi;
import com.qwfys.sample.spring.data.jdbc.module.s01.api.ao.UserAo;
import com.qwfys.sample.spring.data.jdbc.module.s01.api.ao.UserDetailAo;
import com.qwfys.sample.spring.data.jdbc.module.s01.api.ao.UserListAo;
import com.qwfys.sample.spring.data.jdbc.module.s01.biz.business.spec.UsersBusiness;
import com.qwfys.sample.spring.data.jdbc.module.s01.biz.converter.UserConverter;
import com.qwfys.sample.spring.data.jdbc.module.s01.dal.domain.UserRo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "用户管理")
//@RequiredArgsConstructor
@RestController
@RequestMapping("api/users")
public class UsersController {

    @Autowired
    private UsersBusiness usersBusiness;

    @Autowired
    private UserConverter userConverter;

    //public UsersController(UsersBusiness usersBusiness, UserConverter userConverter) {
    //    this.usersBusiness = usersBusiness;
    //    this.userConverter = userConverter;
    //}

    @Operation(summary = "添加用户")
    @PostMapping("add")
    //public boolean save(@Validated UserSaveAo userSaveAo) {
    public boolean save(@Validated(SaveGroup.class) UserAo userAo) {
        UserRo userRo = this.userConverter.toUserRo(userAo);
        return this.usersBusiness.save(userRo);
    }

    @Operation(summary = "删除用户")
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Long id) {
        return this.usersBusiness.removeById(id);
    }

    @Operation(summary = "更新用户")
    @PutMapping("update")
    //public boolean update(@Validated UserUpdateAo userUpdateAo) {
    public boolean update(@Validated(UpdateGroup.class) UserAo userAo) {
        UserRo userRo = this.userConverter.toUserRo(userAo);
        return this.usersBusiness.update(userRo);
    }

    @Operation(summary = "列表展示用户")
    @GetMapping("list")
    public List<UserListAo> list(UserListAi userListAi) {
        return this.usersBusiness.listBy(userListAi);
    }

    @Operation(summary = "获取用户详情")
    @GetMapping("detail/{id}")
    public UserDetailAo detail(@PathVariable Long id) {
        return this.usersBusiness.findById(id);
    }

    @Operation(summary = "分页展示用户")
    @GetMapping("page")
    public Page<UserListAo> page(UserPageAi userPageAi) {
        return this.usersBusiness.pageBy(userPageAi);
    }

}

