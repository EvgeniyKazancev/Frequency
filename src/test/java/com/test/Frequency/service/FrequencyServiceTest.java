package com.test.Frequency.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.LinkedHashMap;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyServiceTest {

    private final FrequencyService frequencyService = new FrequencyService();




    @Test
    public void testCounter() {
       LinkedHashMap<Character,Integer> actual = frequencyService.counter("~!@#$%^&()_+Q{}|A:\"Z<>?Ё!\"№;%:?()_+Й/ФЯ,");
       LinkedHashMap<Character,Integer> expected = new LinkedHashMap<>(){{
           put('a',3);
           put('v',2);
           put('b',1);
       }};
        System.out.println(expected);
        Assertions.assertEquals(expected,actual);
    }
}