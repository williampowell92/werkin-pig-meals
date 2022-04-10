package com.werkinpig.meals.service;

import com.werkinpig.meals.domain.Food;
import com.werkinpig.meals.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FoodService {

    private final FoodRepository foodRepository;

    public void saveFood(Food food) {
        foodRepository.save(food);
    }

    public Iterable<Food> getAllFoods() {
        return foodRepository.findAll();
    }
}
