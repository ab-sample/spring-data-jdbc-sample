package com.qwfys.sample.spring.data.jdbc.controller;

import com.qwfys.sample.spring.data.jdbc.biz.spec.UserBiz;
import com.qwfys.sample.spring.data.jdbc.domain.UserRo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "用户管理")
@RequiredArgsConstructor
@RestController("api/users")
public class UserController {

    private final UserBiz userBiz;

    @Operation(summary = "查询用户集合")
    @GetMapping()
    public ResponseEntity<List<UserRo>> findAll() {
        List<UserRo> list = this.userBiz.findAll();
        return ResponseEntity.ok(list);
    }

    @Operation(summary = "添加用户")
    @PostMapping()
    public ResponseEntity<UserRo> add(@Validated UserRo userRo) {
        return ResponseEntity.ok(null);
    }
}
