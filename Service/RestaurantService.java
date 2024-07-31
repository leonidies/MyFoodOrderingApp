package com.CodingAge.MyFoodOrderingApp.Service;

import com.CodingAge.MyFoodOrderingApp.Models.ModelRequest.RestaurantRequest;
import com.CodingAge.MyFoodOrderingApp.Models.Restaurant;

import java.util.Optional;

public interface RestaurantService {
  public Restaurant createRestaurant(RestaurantRequest restaurantRequest);

  public Restaurant updateRestaurant( Integer ownerId);

  public Restaurant deleteRestaurant(Integer ownerId);

  public Optional<Restaurant> getRestaurantByOwnerID(Integer id);
}
