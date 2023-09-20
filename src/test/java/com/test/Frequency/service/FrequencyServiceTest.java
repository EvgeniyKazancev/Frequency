package com.test.Frequency.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyServiceTest {

    public static FrequencyService frequencyService;

    @BeforeAll
    public static void before() {
        System.out.println("Start test FrequencyService");
    }

    @Test
    public void testCounter() {
        String result = frequencyService.counter("aaabvv");
        Assertions.assertEquals("a:3 v:2 b:1",result);
    }
}