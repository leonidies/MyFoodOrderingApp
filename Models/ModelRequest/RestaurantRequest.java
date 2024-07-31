package com.CodingAge.MyFoodOrderingApp.Models.ModelRequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class RestaurantRequest {
    private Integer ownerId;
    private String name;
    private String address;
    private String phoneNum;
}
