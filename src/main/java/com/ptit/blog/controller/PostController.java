package com.ptit.blog.controller;


import com.ptit.blog.dto.PostDTO;
import com.ptit.blog.entity.Post;
import com.ptit.blog.service.IPostService;
import jakarta.persistence.Table;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:5173")
@RestController
@RequestMapping("/api/posts")
public class PostController {
    @Autowired
    private IPostService postService;
    @Autowired
    private ModelMapper modelMapper;
//    @GetMapping         // tìm list của post
//    public List<Post> getAllPosts(){
//        return postService.getAllPosts();
//    }
    @GetMapping
    public List<PostDTO> getAllPosts(){
        List<Post> post =postService.getAllPosts();

        return modelMapper.map(post, new TypeToken<List<PostDTO>>(){}.getType());
    }
    @GetMapping("/{id}") // post băằng id
    public PostDTO getPostById(@PathVariable(name = "id") int id){
        Post post = postService.getPostById(id);
        return modelMapper.map(post, PostDTO.class);
    }

    @PutMapping("/update/{id}")
    public void updatePost(@PathVariable(name = "id") int id, @RequestBody Post post){
        post.setId(id);
        postService.updatePost(post);
    }

    @PostMapping

    public void createPost(@RequestBody Post post){
        postService.createPost(post);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePost(@PathVariable(name = "id") int id){
        postService.deletePost(id);
    }




}
