package com.springboottraining.springbasicdemodto.facade;

import com.springboottraining.springbasicdemodto.domain.dto.AppUserRequestDto;
import com.springboottraining.springbasicdemodto.domain.dto.AppUserResponseDto;
import com.springboottraining.springbasicdemodto.domain.entity.AppUser;
import com.springboottraining.springbasicdemodto.mapper.AppUserMapper;
import com.springboottraining.springbasicdemodto.service.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class AppUserFacade {

    private final AppUserService service;
    private final AppUserMapper mapper;

    public List<AppUserResponseDto> getAllUsers() {
        List<AppUser> allUsers = service.getAllUsers();

        return mapper.appUsersToAppUserResponseDtos(allUsers);
    }

    public AppUserResponseDto getUserById(Long id) {
        return null;
    }

    public AppUserResponseDto createUser(AppUserRequestDto user) {
        AppUser appUser = mapper.appUserRequestDtoToAppUser(user);

        AppUser saved = service.createUser(appUser);

        return mapper.appUserToAppUserResponseDto(saved);
    }

    public AppUserResponseDto updateUser(Long id, String username, String email) {
        return null;
    }
}
