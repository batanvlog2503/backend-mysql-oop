package com.ptit.blog.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {
    private int id;
    private String username;
    private String password;
    private String displayName;
    private String email;
}
