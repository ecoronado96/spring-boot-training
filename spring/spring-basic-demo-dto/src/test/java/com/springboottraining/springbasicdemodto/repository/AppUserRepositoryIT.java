package com.springboottraining.springbasicdemodto.repository;

import com.springboottraining.springbasicdemodto.domain.dto.AppUserRequestDto;
import com.springboottraining.springbasicdemodto.domain.entity.AppUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class AppUserRepositoryIT {

    @Autowired
    private AppUserRepository appUserRepository;

    @Test
    void chackQuery() {
        AppUser user = AppUser.builder().username("nameUser").email("3").build();
         user = appUserRepository.save(user);

        System.out.println(user);
    }
}