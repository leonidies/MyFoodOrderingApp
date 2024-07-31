package com.CodingAge.MyFoodOrderingApp.Controller;

import com.CodingAge.MyFoodOrderingApp.Models.ModelRequest.UserRequest;
import com.CodingAge.MyFoodOrderingApp.Models.User;
import com.CodingAge.MyFoodOrderingApp.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/user")
public class userController {
    @Autowired
    private UserService userservice;

    @PostMapping("/register")
    public User registerNewUser(@RequestBody UserRequest userRequest){
        return userservice.registerNewUser(userRequest);
    }
    @PostMapping("/login")
    public User userLogIn( @RequestParam String email,String password){
        return userservice.userLogIn(email,password);
    }
    @GetMapping("/seeuser")
    public Optional<User> getUserProfile(Integer id){
        return userservice.getUserProfile(id);
    }
}

