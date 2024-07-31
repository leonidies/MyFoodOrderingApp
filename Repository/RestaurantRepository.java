package com.CodingAge.MyFoodOrderingApp.Repository;

import com.CodingAge.MyFoodOrderingApp.Models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant,Integer> {


    Restaurant findByOwnerId(Integer ownerid);
}
