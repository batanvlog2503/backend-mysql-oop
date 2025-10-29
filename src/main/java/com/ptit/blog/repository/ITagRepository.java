package com.ptit.blog.repository;

import com.ptit.blog.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITagRepository extends JpaRepository<Tag, Integer> {
}
