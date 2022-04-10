package com.werkinpig.meals.domain;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class FoodTest {

    @Test
    void shouldCreateFood() {
        var food = new Food("Chicken", 100, 128, BigDecimal.ZERO, BigDecimal.valueOf(2.7),
            BigDecimal.valueOf(26));

        var expectedFood = new Food("Chicken", 100, 128, BigDecimal.ZERO,
            BigDecimal.valueOf(2.7), BigDecimal.valueOf(26));
        assertThat(food).isEqualTo(expectedFood);
    }

}