package com.CodingAge.MyFoodOrderingApp.Service;

import com.CodingAge.MyFoodOrderingApp.Models.ModelRequest.UserRequest;
import com.CodingAge.MyFoodOrderingApp.Models.User;

import java.util.Optional;


public interface UserService {

    public User registerNewUser(UserRequest userRequest);

    public User userLogIn(String email,String password);

    public User findByEmail(String email);

    public Optional<User> getUserProfile(Integer id);


}



