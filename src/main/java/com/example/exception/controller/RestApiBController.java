package com.example.exception.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/b")
public class RestApiBController {

    private static final Logger log = LoggerFactory.getLogger(RestApiBController.class);

    @GetMapping("/hello")
    public void hello(){
        throw new NumberFormatException("number format exception");
    }
//    @ExceptionHandler(value = {NumberFormatException.class})
//    public ResponseEntity numberFormatException(
//            NumberFormatException e
//    ){
//        log.error("RestApiBController",e);
//        return ResponseEntity.ok().build();
//    }
}
