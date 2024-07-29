package com.qwfys.sample.spring.data.jdbc.domain;


import com.qwfys.sample.spring.data.jdbc.common.validate.SaveGroup;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

//@Builder
@Schema(title = "用户实体")
@Table("sys_user")
public record UserRo(
        @Id
        @NotBlank(groups = {UpdateGroup.class},message = "用户名不能为空")
        Integer id,

        @NotBlank(groups = {SaveGroup.class},message = "用户名不能为空")
        @Schema(title = "用户名")
        String username,

        @Schema(title = "密码")
        String password,

        @Schema(title = "账号是否过期,0:未过期,1:已过期", example = "0")
        Integer accountNonExpired,

        @Schema(title = "账号是否锁定,0:未锁定,1:已锁定", example = "0")
        Integer accountNonLocked,

        @Schema(title = "认证是否过期,0:未过期,1:已过期", example = "0")
        Integer credentialsNonExpired,

        @Schema(title = "是否可用,0:不可用,1:可用", example = "1")
        Integer enabled,

        @Schema(title = "姓名")
        String fullName,

        @Schema(title = "邮件地址")
        String emailAddress,

        @Schema(title = "生日")
        LocalDate birthDate
) {

}
