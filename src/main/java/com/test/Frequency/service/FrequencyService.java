package com.test.Frequency.service;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FrequencyService  {

    public String counter(String str) {


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
            List<Map.Entry<Character, Integer>> result = count.entrySet()
                    .stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .toList();

            StringBuilder sb = new StringBuilder();
            for (Map.Entry<Character, Integer> entry : result) {
                sb.append(entry.getKey()).append(":").append(entry.getValue()).append(" ");

            }

            return sb.toString();


    }
}