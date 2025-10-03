package com.springboottraining.springbasicdemodto.repository;

import com.springboottraining.springbasicdemodto.domain.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {

}
