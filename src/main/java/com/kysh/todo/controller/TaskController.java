package com.kysh.todo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/task")
public class TaskController {

    @RequestMapping(name = "/get-data")
    public ResponseEntity<Object>getData(){
        return ResponseEntity.ok("");
    }
}
