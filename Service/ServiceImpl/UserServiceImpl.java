package com.CodingAge.MyFoodOrderingApp.Service.ServiceImpl;

import com.CodingAge.MyFoodOrderingApp.Models.ModelRequest.UserRequest;
import com.CodingAge.MyFoodOrderingApp.Models.User;
import com.CodingAge.MyFoodOrderingApp.Repository.UserRepository;
import com.CodingAge.MyFoodOrderingApp.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
  @Autowired
    UserRepository userRepository;


    @Override
    public User registerNewUser(UserRequest userRequest) {
        User user=new User();
        user.setUserName(userRequest.getUserName());
        user.setEmail(userRequest.getEmail());
        user.setRole(userRequest.getRole());
        user.setPassword(userRequest.getPassword());
        return userRepository.save(user);
    }

    @Override
    public User userLogIn(String email,String password) {
        User user = findByEmail(email);
        if (user!=null){
            if(email.equals(user.getEmail()) && password.equals(user.getPassword())){
                return user;
            }
        }
        return new User();

    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public Optional<User> getUserProfile(Integer id ) {

        return userRepository.findById(id);
    }
}
