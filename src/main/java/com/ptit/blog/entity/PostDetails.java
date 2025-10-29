package com.ptit.blog.entity;

import com.ptit.blog.entity.Post;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "post_details")
public class PostDetails {

    @Id
    @Column(name = "post_id")
    private int id;

    @Column(name = "post_introduction", columnDefinition = "MEDIUMTEXT", nullable = false)
    private String postIntroduction;

    @Column(name = "post_content", columnDefinition = "MEDIUMTEXT", nullable = false)
    private String postContent;

    @Column(name = "post_end_content", columnDefinition = "MEDIUMTEXT", nullable = false)
    private String postEndContent;

    @Column(name = "post_img", length = 1000, nullable = false)
    private String postImg;

    @Column(name = "post_link", length = 1000, nullable = false)
    private String postLink;

//    @OneToOne
//    @MapsId // 🔥 quan trọng: dùng cùng khóa chính với Post
//    @JoinColumn(name = "post_id") // 🔥 chỉ rõ cột khóa ngoại
//    private Post post;
}
