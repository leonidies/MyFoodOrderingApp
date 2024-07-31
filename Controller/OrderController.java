package com.CodingAge.MyFoodOrderingApp.Controller;

import com.CodingAge.MyFoodOrderingApp.Models.ModelRequest.OrderRequest;
import com.CodingAge.MyFoodOrderingApp.Models.Order;
import com.CodingAge.MyFoodOrderingApp.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v4/order")
public class OrderController {
    @Autowired
    private OrderService orderService;


    @PostMapping("/neworder")
    public Order placeNewOrder(@RequestBody OrderRequest orderRequest){
        return orderService.placeNewOrder(orderRequest);
    }

    @GetMapping("/seeorderofcustomer")
    public List<Order> getOrderByCustomerId(@RequestParam Integer customerId){
        return orderService.getOrderByCustomerId(customerId);
    }

    @GetMapping("/seeorderofrestaurant")
    public Order getOrderByRestaurantId(@RequestParam Integer restaurantId){
        return orderService.getOrderByRestaurantId(restaurantId);
    }

    @PutMapping("/updateorderstatus")
    public Order updateOrderStatus(@RequestParam Integer id,String status){
        return orderService.updateOrderStatus(id,status);
    }

}
