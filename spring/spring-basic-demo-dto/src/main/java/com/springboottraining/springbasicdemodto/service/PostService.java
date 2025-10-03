package com.springboottraining.springbasicdemodto.service;

import com.springboottraining.springbasicdemodto.domain.entity.AppUser;
import com.springboottraining.springbasicdemodto.domain.entity.Post;
import com.springboottraining.springbasicdemodto.repository.AppUserRepository;
import com.springboottraining.springbasicdemodto.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final PostRepository postRepository;
    private final AppUserRepository userRepository;

    public PostService(PostRepository postRepository, AppUserRepository userRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Optional<Post> getPostById(Long id) {
        return postRepository.findById(id);
    }

    public Post createPost(Long userId, Post post) {
        AppUser appUser = userRepository.findById(userId).orElseThrow();
        post.setAppUser(appUser);
        return postRepository.save(post);
    }

    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }


}
