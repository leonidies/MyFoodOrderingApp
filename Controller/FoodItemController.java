package com.CodingAge.MyFoodOrderingApp.Controller;

import com.CodingAge.MyFoodOrderingApp.Models.FoodItem;
import com.CodingAge.MyFoodOrderingApp.Models.ModelRequest.FoodItemRequest;
import com.CodingAge.MyFoodOrderingApp.Service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v3/fooditem")
public class FoodItemController {
    @Autowired
    private FoodItemService foodItemService;

    @PostMapping("/addfood")
    public FoodItem addFood(@RequestBody FoodItemRequest foodItemRequest){
        return foodItemService.addFood(foodItemRequest);
    }

    @PutMapping("/updatefood")
    public FoodItem updateFoodItem(@RequestParam Integer id){
          return foodItemService.updateFoodItem(id);
    }

    @DeleteMapping("/deletefood")
    public FoodItem deleteFoodItemById(@RequestParam Integer id){
        return foodItemService.deleteFoodItemById(id);
    }

    @GetMapping("/seefooditem")
    public Optional<FoodItem> getFoodItemByRestaurantID(@RequestParam Integer id){
        return foodItemService.getFoodItemByRestaurantID(id);
    }



}
