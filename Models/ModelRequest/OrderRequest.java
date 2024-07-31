package com.CodingAge.MyFoodOrderingApp.Models.ModelRequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class OrderRequest {
    private Integer customerId;
    private Integer restaurantId;
    List<String> foodItems=new ArrayList<>();

}
