package com.CodingAge.MyFoodOrderingApp.Service.ServiceImpl;

import com.CodingAge.MyFoodOrderingApp.Models.FoodItem;
import com.CodingAge.MyFoodOrderingApp.Models.ModelRequest.FoodItemRequest;
import com.CodingAge.MyFoodOrderingApp.Repository.FoodItemRepo;
import com.CodingAge.MyFoodOrderingApp.Service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FoodItemServiceImpl implements FoodItemService {
   @Autowired
   FoodItemRepo foodItemRepo;

    @Override
    public FoodItem addFood( FoodItemRequest foodItemRequest) {
        FoodItem foodItem=new FoodItem();
        foodItem.setRestaurantId(foodItemRequest.getRestaurantId());
        foodItem.setName(foodItemRequest.getName());
        foodItem.setDescription(foodItemRequest.getDescription());
        foodItem.setPrice(foodItemRequest.getPrice());
        foodItem.setAvailability(foodItemRequest.isAvailability());
         return   foodItemRepo.save(foodItem);

    }

    @Override
    public FoodItem updateFoodItem(Integer id) {
        Optional<FoodItem> foodItem=foodItemRepo.findById(id);
        if (foodItem.isPresent()){
          foodItemRepo.save(foodItem.get());
          return foodItem.get();

        }
        return new FoodItem();
    }

    @Override
    public FoodItem deleteFoodItemById(Integer id) {
        Optional<FoodItem> foodItem=foodItemRepo.findById(id);
        if (foodItem.isPresent()) {
            foodItemRepo.delete(foodItem.get());
            return foodItem.get();
        }
       return null;
    }

    @Override
    public Optional<FoodItem> getFoodItemByRestaurantID(Integer id) {
        return foodItemRepo.findById( id);

    }
}
