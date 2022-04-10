package com.werkinpig.meals.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Getter
@EqualsAndHashCode
@NoArgsConstructor
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private long amount;
    private long kiloCalories;
    private BigDecimal carbohydrates;
    private BigDecimal fat;
    private BigDecimal protein;

    public Food(String name, long amount, long kiloCalories, BigDecimal carbohydrates, BigDecimal fat,
                BigDecimal protein) {
        this.name = name;
        this.amount = amount;
        this.kiloCalories = kiloCalories;
        this.carbohydrates = carbohydrates;
        this.fat = fat;
        this.protein = protein;
    }
}
