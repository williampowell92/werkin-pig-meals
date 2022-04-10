package com.werkinpig.meals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class MealsFunctionalTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldSaveAndGetFoods() throws Exception {
        mockMvc.perform(post("/foods")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                    "    \"name\": \"Chicken\",\n" +
                    "    \"amount\": 100,\n" +
                    "    \"kiloCalories\": 128,\n" +
                    "    \"carbohydrates\": 0,\n" +
                    "    \"fat\": 2.7,\n" +
                    "    \"protein\": 26\n" +
                    "}")
                .characterEncoding("utf-8"))
            .andExpect(status().isOk());

        mockMvc.perform(get("/foods"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(jsonPath("$[0].id", is(1)))
            .andExpect(jsonPath("$[0].name", is("Chicken")))
            .andExpect(jsonPath("$[0].amount", is(100)))
            .andExpect(jsonPath("$[0].kiloCalories", is(128)))
            .andExpect(jsonPath("$[0].carbohydrates", is(0.0)))
            .andExpect(jsonPath("$[0].fat", is(2.7)))
            .andExpect(jsonPath("$[0].protein", is(26.0)));
    }

}
