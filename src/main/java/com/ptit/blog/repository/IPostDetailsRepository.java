package com.ptit.blog.repository;

import com.ptit.blog.entity.PostDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostDetailsRepository extends JpaRepository<PostDetails, Integer> {
}
