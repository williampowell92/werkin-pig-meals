package com.werkinpig.meals.repository;

import com.werkinpig.meals.domain.Food;
import org.springframework.data.repository.CrudRepository;

public interface FoodRepository extends CrudRepository<Food, Long> {

}
