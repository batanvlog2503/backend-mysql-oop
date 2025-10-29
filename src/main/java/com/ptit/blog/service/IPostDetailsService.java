package com.ptit.blog.service;

import com.ptit.blog.entity.PostDetails;

import java.util.List;

public interface IPostDetailsService {
    List<PostDetails> getAllPostDetails();
    PostDetails getPostDetailsById(int id);

}
