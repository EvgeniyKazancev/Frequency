package com.test.Frequency.controller;


import com.test.Frequency.service.FrequencyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.LinkedHashMap;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(FrequencyControllerTest.class)
class FrequencyControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private FrequencyService service;

    @Test
    public void test1() throws Exception {
        LinkedHashMap<Character, Integer> serviceResponse = new LinkedHashMap<>() {{
            put('a', 3);
            put('c', 2);
            put('b', 1);
        }};

        when(service.counter(any())).thenReturn(serviceResponse);

        String expected = "{\"a\":3,\"c\":2,\"b\":1}";

        this.mockMvc.perform(get("/api/frequency").param("str", ""))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(content().string(expected));
    }

}