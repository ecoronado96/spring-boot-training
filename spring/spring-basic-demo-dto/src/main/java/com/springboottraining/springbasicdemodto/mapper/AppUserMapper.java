package com.springboottraining.springbasicdemodto.mapper;

import com.springboottraining.springbasicdemodto.domain.dto.AppUserRequestDto;
import com.springboottraining.springbasicdemodto.domain.dto.AppUserResponseDto;
import com.springboottraining.springbasicdemodto.domain.entity.AppUser;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AppUserMapper {

    AppUserResponseDto appUserToAppUserResponseDto(AppUser appUser);
    AppUser appUserRequestDtoToAppUser(AppUserRequestDto appUserRequestDto);

    List<AppUserResponseDto> appUsersToAppUserResponseDtos(List<AppUser> appUsers);
}
