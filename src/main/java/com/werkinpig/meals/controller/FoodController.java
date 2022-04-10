package com.werkinpig.meals.controller;

import com.werkinpig.meals.domain.Food;
import com.werkinpig.meals.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/foods")
public class FoodController {

    private final FoodService foodService;

    @GetMapping
    public Iterable<Food> getAllFoods() {
        return foodService.getAllFoods();
    }

    @PostMapping
    public void saveFood(@RequestBody Food food) {
        foodService.saveFood(food);
    }

}
