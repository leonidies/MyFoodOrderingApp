package com.CodingAge.MyFoodOrderingApp.Service;

import com.CodingAge.MyFoodOrderingApp.Models.FoodItem;
import com.CodingAge.MyFoodOrderingApp.Models.ModelRequest.FoodItemRequest;

import java.util.Optional;

public interface FoodItemService {
    public FoodItem addFood( FoodItemRequest foodItemRequest);
    public FoodItem updateFoodItem(Integer id);

    public FoodItem deleteFoodItemById(Integer id);

    public Optional<FoodItem> getFoodItemByRestaurantID(Integer id);

}
