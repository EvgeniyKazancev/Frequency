package com.test.Frequency.service;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

@Service
public class FrequencyService {

    public LinkedHashMap<Character, Integer> counter(String str) {


        Map<Character, Integer> count = new HashMap<>();


        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (!count.containsKey(c)) {
                count.put(c, 1);
            } else {
                int number = count.get(c);
                count.put(c, number + 1);
            }
        }
        LinkedHashMap<Character, Integer> result = count.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(
                        LinkedHashMap::new,
                        (map, entry) -> map.put(entry.getKey(), entry.getValue()),
                        (characterIntegerLinkedHashMap, characterIntegerLinkedHashMap2) -> {
                        }
                );
        return result;

    }
}