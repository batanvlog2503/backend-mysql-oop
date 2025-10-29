package com.ptit.blog.service;

import com.ptit.blog.entity.Post;
import com.ptit.blog.repository.IPostRepository;

import java.util.List;

public interface IPostService{
    List<Post> getAllPosts();
    Post getPostById(int id);

    void updatePost(Post post);

    void createPost(Post post);
    void deletePost(int id);

}
