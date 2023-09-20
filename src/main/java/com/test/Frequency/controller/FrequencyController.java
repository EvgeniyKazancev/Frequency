package com.test.Frequency.controller;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.test.Frequency.response.ResponseMessage;
import com.test.Frequency.service.FrequencyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FrequencyController {
    private final FrequencyService frequencyService;



    public FrequencyController(FrequencyService frequencyService) {
        this.frequencyService = frequencyService;

    }

    @GetMapping("/frequency")
    public ResponseMessage Frequency (@RequestParam String str){
     return new ResponseMessage("Результат : " , frequencyService.counter(str));
    }
}
