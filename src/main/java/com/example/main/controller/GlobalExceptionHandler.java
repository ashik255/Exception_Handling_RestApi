package com.example.main.controller;

import com.example.main.exception.AdminNotFoundException;
import com.example.main.exception.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({AdminNotFoundException.class, ArithmeticException.class, ProductNotFoundException.class})
    public ResponseEntity<Object> returnNotFoundException(Exception nameEx) {
        if (nameEx instanceof AdminNotFoundException) {
            // Some operation
            return new ResponseEntity<>(nameEx.getMessage(), HttpStatus.NOT_FOUND);
        } else if (nameEx instanceof ProductNotFoundException) {
            // Some operation for candidate not found
            return new ResponseEntity<>(nameEx.getMessage(), HttpStatus.NOT_FOUND);
        } else {
            // Some other operation
            return new ResponseEntity<>(nameEx.getMessage(),
                    HttpStatus.BAD_REQUEST);
        }
    }

}
