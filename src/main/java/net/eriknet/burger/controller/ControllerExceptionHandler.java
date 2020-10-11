package net.eriknet.burger.controller;

import net.eriknet.burger.dto.ExceptionDto;
import net.eriknet.burger.exception.MaxToppingsException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler {

    public static final String INVALID_ARGUMENT_MESSAGE = "Invalid meat or bread type";

    @ExceptionHandler(value = { MaxToppingsException.class })
    protected ResponseEntity<Object> handleToppingsExceeded(RuntimeException ex, WebRequest request) {

        var exceptionDto = new ExceptionDto(ex.getMessage());
        return handleExceptionInternal(ex, exceptionDto,
                new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }

    @ExceptionHandler(value = { IllegalArgumentException.class })
    protected ResponseEntity<Object> handleIllegalArgument(RuntimeException ex, WebRequest request) {

        var exceptionDto = new ExceptionDto(INVALID_ARGUMENT_MESSAGE);
        return handleExceptionInternal(ex, exceptionDto,
                new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }
}