package com.training.Port.controller;
import com.training.Port.model.User;
import com.training.Port.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/vi")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("getAllUser")
    public List<User> getall(){
        return userService.getall();

    }
    @PostMapping("/saveuser")
    public User saveuser(@RequestBody User user){
        return userService.addUser(user);
    }
    @DeleteMapping("/deleteuser/{id}")
    public String getdelete(@PathVariable long id){
        return userService.deleteUser(id);
    }
    @PutMapping("/updateuser")
    public User updateuser(@RequestBody User user){
        return userService.updateUser(user);
    }
}
