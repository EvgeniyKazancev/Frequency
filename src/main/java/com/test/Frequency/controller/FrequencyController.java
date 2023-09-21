package com.test.Frequency.controller;


import com.test.Frequency.service.FrequencyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;

@RestController
@RequestMapping("/api")
public class FrequencyController {
    private final FrequencyService frequencyService;



    public FrequencyController(FrequencyService frequencyService) {
        this.frequencyService = frequencyService;

    }

    @GetMapping("/frequency")
    public LinkedHashMap<Character,Integer> Frequency (@RequestParam String str){
     return  frequencyService.counter(str);
    }
}
