package com.CodingAge.MyFoodOrderingApp.Models.ModelRequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserRequest {
    private  String userName;
    private String password;
    private String email;
    private String role;
}
