package com.test.Frequency.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonFormat
public class ResponseMessage {

    String message;
    String result;
}
