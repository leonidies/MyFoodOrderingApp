package com.CodingAge.MyFoodOrderingApp.Repository;

import com.CodingAge.MyFoodOrderingApp.Models.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface FoodItemRepo extends JpaRepository<FoodItem,Integer> {


    @Override
    Optional<FoodItem> findById(Integer id);

}
