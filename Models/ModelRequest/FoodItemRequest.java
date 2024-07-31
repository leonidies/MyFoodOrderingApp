package com.CodingAge.MyFoodOrderingApp.Models.ModelRequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class FoodItemRequest {
    private Integer restaurantId;
    private String name;
    private String description;
    private String price;
    private boolean availability;
}
