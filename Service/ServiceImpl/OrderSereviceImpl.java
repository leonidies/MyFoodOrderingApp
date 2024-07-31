package com.CodingAge.MyFoodOrderingApp.Service.ServiceImpl;

import com.CodingAge.MyFoodOrderingApp.Models.ModelRequest.OrderRequest;
import com.CodingAge.MyFoodOrderingApp.Models.Order;
import com.CodingAge.MyFoodOrderingApp.Repository.OrderRepo;
import com.CodingAge.MyFoodOrderingApp.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OrderSereviceImpl implements OrderService {
    @Autowired
    OrderRepo orderRepo;
    @Override
    public Order placeNewOrder(OrderRequest orderRequest) {

        Order order=new Order();
        order.setCustomerId(orderRequest.getCustomerId());
        order.setRestaurantId(orderRequest.getRestaurantId());
        order.setFoodItems(orderRequest.getFoodItems());
        return orderRepo.save(order);
    }

    @Override
    public List<Order> getOrderByCustomerId(Integer customerId) {
       return orderRepo.findAllByCustomerId(customerId);
    }

    private Order findBycustomerId(Integer customerId) {
        return orderRepo.findBycustomerId(customerId);
    }

    @Override
    public Order getOrderByRestaurantId(Integer restaurantId) {
       return orderRepo.findByRestaurantId(restaurantId);
    }

    @Override
    public Order updateOrderStatus(Integer id, String status) {
       Optional<Order> order=findById(id);

       if (order.isPresent()){
           order.get().setStatus(status);
           orderRepo.save(order.get());
           return order.get();
       }
       return new Order();
    }

    private Optional<Order> findById(Integer id) {
        return orderRepo.findById(id);
    }

}
