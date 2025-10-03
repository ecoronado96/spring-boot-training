package com.springboottraining.springbasicdemodto.service;

import com.springboottraining.springbasicdemodto.domain.entity.AppUser;
import com.springboottraining.springbasicdemodto.repository.AppUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppUserService {
    private final AppUserRepository userRepository;

    public AppUserService(AppUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<AppUser> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<AppUser> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public AppUser createUser(AppUser user) {
        return userRepository.save(user);
    }

    public AppUser updateUser(Long id, String username, String email) {
        AppUser user = userRepository.findById(id).orElseThrow();
        if (username != null) user.setUsername(username);
        if (email != null) user.setEmail(email);
        return userRepository.save(user);
    }
}
