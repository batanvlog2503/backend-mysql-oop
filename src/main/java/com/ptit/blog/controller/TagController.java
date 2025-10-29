package com.ptit.blog.controller;


import com.ptit.blog.dto.PostDTO;
import com.ptit.blog.dto.TagDTO;
import com.ptit.blog.entity.Tag;
import com.ptit.blog.service.ITagService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:5173")
@RestController
@RequestMapping("/api/tags")
public class TagController {

    @Autowired
    private ITagService tagService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public List<TagDTO> getAllTags(){
        List<Tag> tag = tagService.getAllTags();
        return modelMapper.map(tag, new TypeToken<List<TagDTO>>(){}.getType());
    }

    @PostMapping
    public void createTag(@RequestBody Tag tag){
        tagService.createTag(tag);
    }

    @PutMapping("/update/{id}")
    public void updateTag(@PathVariable(name = "id") int id, @RequestBody Tag tag){
        tag.setId(id);
        tagService.updateTag(tag);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTag(@PathVariable(name = "id") int id){
        tagService.deleteTag(id);
    }
}
