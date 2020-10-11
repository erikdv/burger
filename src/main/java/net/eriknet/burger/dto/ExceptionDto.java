package net.eriknet.burger.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExceptionDto {

    @JsonProperty("error")
    String message;

    public ExceptionDto(String message) {
        this.message = message;
    }
}
