package com.apps.dev.FormApi.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
public class InitController {

    @GetMapping("/init")
    public ResponseEntity init(){
        return new ResponseEntity("{\"message\": \"Controller is working fine\"}", HttpStatus.OK);
    }
}
