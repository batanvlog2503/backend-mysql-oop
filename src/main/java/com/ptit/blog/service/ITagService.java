package com.ptit.blog.service;

import com.ptit.blog.entity.Tag;

import java.util.List;

public interface ITagService {

    List<Tag> getAllTags();

    void createTag(Tag tag);
    void updateTag(Tag tag);
    void deleteTag(int id);

}
