package com.qwfys.sample.spring.data.jdbc.module.s099.api.ao;

import java.time.LocalDate;

public record UserSaveAo(
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
