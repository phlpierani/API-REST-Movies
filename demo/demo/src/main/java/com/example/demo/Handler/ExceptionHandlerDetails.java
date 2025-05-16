package com.example.demo.Handler;

import com.example.demo.Exceptions.BadRequestExceptionDetails;
import org.apache.coyote.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

    @ControllerAdvice
    public class ExceptionHandlerDetails {

        @ExceptionHandler(BadRequestException.class)
        public ResponseEntity<BadRequestExceptionDetails> handleBadRequestException(BadRequestException bre) {
            return new ResponseEntity<>(BadRequestExceptionDetails.builder()
                    .timestamp(System.currentTimeMillis())
                    .status(HttpStatus.BAD_REQUEST.value())
                    .title("Bad Request Exception, check the documentation")
                    .detail(bre.getMessage())
                    .developerMessage(bre.getClass().getName())
                    .build(), HttpStatus.BAD_REQUEST);
        }
    }

