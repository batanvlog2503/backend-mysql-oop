package com.ptit.blog.controller;

import com.ptit.blog.entity.PostDetails;
import com.ptit.blog.service.IPostDetailsService;
import com.ptit.blog.service.IPostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:5173")
@RestController
@RequestMapping("/api/postdetails")
public class PostDetailsController {

    @Autowired
    private IPostDetailsService postDetailsService;
    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public List<PostDetails> getAllPostDetails(){
        return postDetailsService.getAllPostDetails();
    }

    @GetMapping("/{id}")
    public PostDetails getPostDetailsById(@PathVariable(name = "id") int id){
        return postDetailsService.getPostDetailsById(id);
    }
}
