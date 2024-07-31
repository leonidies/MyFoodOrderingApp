package com.CodingAge.MyFoodOrderingApp.Service;

import com.CodingAge.MyFoodOrderingApp.Models.ModelRequest.OrderRequest;
import com.CodingAge.MyFoodOrderingApp.Models.Order;

import java.util.List;

public interface OrderService {
    public Order placeNewOrder(OrderRequest orderRequest);

    public List<Order> getOrderByCustomerId(Integer customerId);

    public Order getOrderByRestaurantId(Integer restaurantId);

    public Order updateOrderStatus(Integer id,String status);
}
