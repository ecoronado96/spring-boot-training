package com.springboottraining.springbasicdemodto.controller;

import com.springboottraining.springbasicdemodto.domain.dto.AppUserRequestDto;
import com.springboottraining.springbasicdemodto.domain.dto.AppUserResponseDto;
import com.springboottraining.springbasicdemodto.facade.AppUserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class AppUserController {

    private final AppUserFacade facade;

    @GetMapping
    public List<AppUserResponseDto> getAllUsers() {
        return facade.getAllUsers();
    }

    @PostMapping
    public AppUserResponseDto createUser(@RequestBody AppUserRequestDto user) {
        return facade.createUser(user);
    }

    @PatchMapping("/{id}")
    public AppUserResponseDto updateUser(@PathVariable Long id,
                              @RequestParam(required = false) String username,
                              @RequestParam(required = false) String email) {
        return facade.updateUser(id, username, email);
    }
}
