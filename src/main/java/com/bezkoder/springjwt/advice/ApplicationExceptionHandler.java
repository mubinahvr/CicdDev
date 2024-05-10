package com.bezkoder.springjwt.advice;

import com.bezkoder.springjwt.exception.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ApplicationExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleInvalidArgument(MethodArgumentNotValidException ex){
        Map<String, String> errMap = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error->{
            errMap.put(error.getField(), error.getDefaultMessage());
        });
        return  errMap;
    }


    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
@ExceptionHandler(StudentNotFoundException.class)
    public Map<String,String> handleBusinessException(StudentNotFoundException ex){
    Map<String, String> errMap = new HashMap<>();
    errMap.put("errorMessage",ex.getMessage());
    return errMap;

    }
}
