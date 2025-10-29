package com.ptit.blog.dto;


import com.ptit.blog.entity.PostDetails;
import com.ptit.blog.entity.Tag;
import com.ptit.blog.entity.User;
import com.ptit.blog.enums.CommentStatus;
import com.ptit.blog.enums.PostStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
public class PostDTO {
    private int id;
    private String title;
    private String content;
    private String excerpt;
    private String slug;
    private LocalDateTime publishedAt;
    private LocalDateTime updatedAt;
    private PostStatus status;
    private Integer viewCount;



    @Setter
    @Getter
    @NoArgsConstructor
    public static class UserDTO{
        private int id;
        private String username;
        private String email;
        private String displayName;
        private Timestamp createdAt;

    }

    private UserDTO authorUser;
    @Setter
    @Getter
    @NoArgsConstructor
    public static class CategoryDTO{
        private int id;
        private String name;
        private String slug;

    }

    private CategoryDTO category;
    @Setter
    @Getter
    @NoArgsConstructor
    public static class CommentDTO{
        private int id;
        private String authorName;
        private String authorEmail;
        private String content;
        private LocalDateTime createdAt;
        private CommentStatus status;
    }
    private List<CommentDTO> comments;

    @Setter
    @Getter
    @NoArgsConstructor
    public static class TagDTO{
        private int id;
        private String name;
        private String slug;
    }
    private List<TagDTO>  tags;


//    @Setter
//    @Getter
//    @NoArgsConstructor
//    public static class PostDetails{
//        private int id;
//        private String postIntroduction;
//        private String postContent;
//        private String postEndContent;
//        private String postImg;
//        private String postLink;
//    }
//    private PostDetails postDetail;


}
