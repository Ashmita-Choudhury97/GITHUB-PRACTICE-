package com.Ecommerce.Ecommerce1.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;

public class GlobalExceptionHandler {

    //ResponseStatusException is a Spring Framework exception that is often used in REST APIs to throw custom HTTP status codes along with an error reason.
    @ExceptionHandler(ResponseStatusException.class)
    public String handleResponseStatus(ResponseStatusException ex)
    {
        return ex.getReason();

        //ex.getReason() is called to retrieve the reason message provided by the ResponseStatusException.
        //The getReason() method returns a custom message (if set) explaining why the exception was thrown. For example, if ResponseStatusException was created with a message such as "Product not found", getReason() would return that exact message.
    }

    @ExceptionHandler(RuntimeException.class)
            public String handleRuntimeException(RuntimeException ex)
    {
        return "Error:"+ex.getMessage();
    }
}
