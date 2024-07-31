package com.CodingAge.MyFoodOrderingApp.Service.ServiceImpl;

import com.CodingAge.MyFoodOrderingApp.Models.ModelRequest.RestaurantRequest;
import com.CodingAge.MyFoodOrderingApp.Models.Restaurant;
import com.CodingAge.MyFoodOrderingApp.Repository.RestaurantRepository;
import com.CodingAge.MyFoodOrderingApp.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class RestaurantSeviceImpl implements RestaurantService {
    @Autowired
    RestaurantRepository restaurantRepository;

    @Override
    public Restaurant createRestaurant(RestaurantRequest restaurantRequest) {
        Restaurant restaurant=new Restaurant();
        restaurant.setOwnerId(restaurantRequest.getOwnerId());
        restaurant.setName(restaurantRequest.getName());
        restaurant.setAddress(restaurantRequest.getAddress());
        restaurant.setPhoneNum(restaurantRequest.getPhoneNum());
        return restaurantRepository.save(restaurant);
    }

    @Override
    public Restaurant updateRestaurant(Integer ownerId) {
      Restaurant restaurant=findByOwnerId(ownerId);
      if (restaurant!=null){
          if (ownerId==restaurant.getOwnerId()){
              return restaurant;
          }
      }
      return new Restaurant();
    }

    private Restaurant findByOwnerId(Integer ownerId) {
        return restaurantRepository.findByOwnerId(ownerId);
    }

    @Override
    public Restaurant deleteRestaurant(Integer ownerid) {
        Restaurant restaurant=restaurantRepository.findByOwnerId(ownerid);
        if (restaurant!=null) {
           restaurantRepository.delete(restaurant);
            }
        return null;
    }


    @Override
    public Optional<Restaurant> getRestaurantByOwnerID(Integer id) {
        return restaurantRepository.findById(id);
    }
}
