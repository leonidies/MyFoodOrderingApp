package com.CodingAge.MyFoodOrderingApp.Repository;

import com.CodingAge.MyFoodOrderingApp.Models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepo extends JpaRepository<Order,Integer> {
    Order findBycustomerId(Integer customerId);

    Order findByRestaurantId(Integer restaurantId);

    List<Order> findAllByCustomerId(Integer customerId);
}
