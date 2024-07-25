package com.qwfys.sample.spring.data.jdbc.module.s01.api.ao;

import com.qwfys.sample.spring.data.jdbc.common.validater.SaveGroup;
import com.qwfys.sample.spring.data.jdbc.common.validater.UpdateGroup;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;

import java.time.LocalDate;

@Valid
public record UserAo(

        @NotNull(groups = {UpdateGroup.class})
        @Null(groups = {SaveGroup.class})
        @Schema(description = "ID")
        Integer id,

        @Schema(description = "用户名")
        String username,

        @Schema(description = "密码")
        String password,

        @Schema(description = "账号是否过期")
        Boolean accountNonExpired,

        @Schema(description = "账号是否被锁")
        Boolean accountNonLocked,

        @Schema(description = "证书是否过期")
        Boolean credentialsNonExpired,

        @Schema(description = "是否可用")
        Boolean enabled,

        @Schema(description = "名字")
        String firstName,

        @Schema(description = "姓氏")
        String lastName,

        @Schema(description = "邮箱地址")
        String emailAddress,

        @Schema(description = "出生年月")
        LocalDate birthdate
) {

}
