package com.ptit.blog.controller;

import com.ptit.blog.dto.UserDTO;
import com.ptit.blog.entity.User;
import com.ptit.blog.service.IUserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:5173")
@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private IUserService userService;
    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public List<UserDTO> getAllUsers(){
        List<User> users = userService.getAllUsers();
        return modelMapper.map(users, new TypeToken<List<UserDTO>>(){}.getType());
    }

    @GetMapping("/{id}")
    public  UserDTO getUserById(@PathVariable(name = "id") int id){
        User user = userService.getUserById(id);
        return modelMapper.map(user,UserDTO.class);
    }

    @PostMapping
    public void createUser(@RequestBody User user){
        userService.createUser(user);
    }
}
