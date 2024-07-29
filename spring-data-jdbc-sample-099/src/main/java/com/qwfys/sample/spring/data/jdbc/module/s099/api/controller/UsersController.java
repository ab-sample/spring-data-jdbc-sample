package com.qwfys.sample.spring.data.jdbc.module.s099.api.controller;

import com.qwfys.sample.spring.data.jdbc.common.validater.SaveGroup;
import com.qwfys.sample.spring.data.jdbc.common.validater.UpdateGroup;
import com.qwfys.sample.spring.data.jdbc.module.s099.api.ai.UserListAi;
import com.qwfys.sample.spring.data.jdbc.module.s099.api.ai.UserPageAi;
import com.qwfys.sample.spring.data.jdbc.module.s099.api.ao.UserAo;
import com.qwfys.sample.spring.data.jdbc.module.s099.api.ao.UserDetailAo;
import com.qwfys.sample.spring.data.jdbc.module.s099.api.ao.UserListAo;
import com.qwfys.sample.spring.data.jdbc.module.s099.biz.business.spec.UsersBusiness;
import com.qwfys.sample.spring.data.jdbc.module.s099.biz.converter.UserConverter;
import com.qwfys.sample.spring.data.jdbc.module.s099.dal.domain.UserRo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
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
    @ResponseStatus(HttpStatus.CREATED)
    //public boolean save(@Validated UserSaveAo userSaveAo) {
    public boolean save(@NotNull @Validated(SaveGroup.class) UserAo userAo) {
        //public boolean save(@Validated(SaveGroup.class) UserAo userAo) {
        UserRo userRo = this.userConverter.toUserRo(userAo);
        return this.usersBusiness.save(userRo);
    }

    @Operation(summary = "删除用户")
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Long id) {
        return this.usersBusiness.removeById(id);
    }

    @Operation(summary = "更新用户")
    @PutMapping("/{id}")
    //@PutMapping("update")
    @ResponseStatus(HttpStatus.OK)
    public boolean update(@PathVariable("id") Long id, @Validated(UpdateGroup.class) UserAo userAo) {
        //public boolean update(@Validated UserUpdateAo userUpdateAo) {
        UserRo userRo = this.userConverter.toUserRo(userAo);
        return this.usersBusiness.update(userRo);
    }

    @Operation(summary = "列表展示用户")
    @GetMapping("/")
    //@GetMapping("list")
    public List<UserListAo> findAll(UserListAi userListAi) {
        //public List<UserListAo> list(UserListAi userListAi) {
        return this.usersBusiness.listBy(userListAi);
    }

    @Operation(summary = "获取用户详情")
    @GetMapping("/{id}")
    //@GetMapping("detail/{id}")
    public UserDetailAo findById(@PathVariable Long id) {
        //public UserDetailAo detail(@PathVariable Long id) {
        return this.usersBusiness.findById(id);
    }

    @Operation(summary = "分页展示用户")
    @GetMapping("/page")
    //@GetMapping("page")
    public Page<UserListAo> pageAll(UserPageAi userPageAi) {
        //public Page<UserListAo> page(UserPageAi userPageAi) {
        return this.usersBusiness.pageBy(userPageAi);
    }

}

