package com.CodingAge.MyFoodOrderingApp.Controller;

import com.CodingAge.MyFoodOrderingApp.Models.ModelRequest.RestaurantRequest;
import com.CodingAge.MyFoodOrderingApp.Models.Restaurant;
import com.CodingAge.MyFoodOrderingApp.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v2/restaurant")
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;

    @PostMapping("/newrestaurantcreated")
    public Restaurant createNewRestaurant(@RequestBody RestaurantRequest restaurantRequest){
        return restaurantService.createRestaurant(restaurantRequest);
    }

    @PutMapping("/updaterestaurant")
    public Restaurant updateRestaurant(@RequestParam Integer ownerId){
        return restaurantService.updateRestaurant(ownerId);
    }

    @DeleteMapping("/deleterestaurant")
    public  Restaurant deleteRestaurant(@RequestParam Integer ownerId){
        return restaurantService.deleteRestaurant(ownerId);
    }

    @GetMapping("/seerestaurant")
    public Optional<Restaurant> seeRestaurant( Integer id){
        return restaurantService.getRestaurantByOwnerID(id);
    }

}
