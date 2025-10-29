package com.ptit.blog.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class TagDTO {
    private int id;
    private String name;
    private String slug;
}
