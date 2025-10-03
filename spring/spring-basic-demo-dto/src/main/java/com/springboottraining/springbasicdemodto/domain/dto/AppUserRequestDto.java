package com.springboottraining.springbasicdemodto.domain.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.springboottraining.springbasicdemodto.domain.entity.Post;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
public class AppUserRequestDto {
    private String username;
    private String email;
}

