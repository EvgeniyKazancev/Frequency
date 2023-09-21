package com.test.Frequency.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.LinkedHashMap;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyServiceTest {

    private final FrequencyService frequencyService = new FrequencyService();

    @BeforeAll
    public static void before() {
        System.out.println("Start test FrequencyService");
    }

    @Test
    public void testCounter() {
       LinkedHashMap<Character,Integer> actual = frequencyService.counter("aaabvv");
       LinkedHashMap<Character,Integer> expected = new LinkedHashMap<>(){{
           put('a',3);
           put('v',2);
           put('b',1);
       }};
        Assertions.assertEquals(expected,actual);
    }
}