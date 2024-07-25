package com.qwfys.sample.spring.data.jdbc.module.s01.api.ai;

import java.time.LocalDate;

public record UserListAi(
        Integer id,
        String username,
        String password,
        Boolean accountNonExpired,
        Boolean accountNonLocked,
        Boolean credentialsNonExpired,
        Boolean enabled,
        String firstName,
        String lastName,
        String emailAddress,
        LocalDate birthdate
){

}
