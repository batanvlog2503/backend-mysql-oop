package com.ptit.blog.service;

import com.ptit.blog.entity.Post;
import com.ptit.blog.entity.PostDetails;
import com.ptit.blog.repository.IPostDetailsRepository;
import com.ptit.blog.repository.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostDetailsService implements IPostDetailsService{

    @Autowired
    private IPostDetailsRepository postDetailsRepository;
    @Override
    public List<PostDetails> getAllPostDetails() {
        return postDetailsRepository.findAll();
    }

    @Override
    public PostDetails getPostDetailsById(int id) {
        return postDetailsRepository.findById(id).get();
    }
}
