package com.kysh.todo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/test")
public class TestController {

    @RequestMapping(path = "/hello")
    public String greeting() {
        return "hello world";
    }

    @RequestMapping(path = "/only")
    public String only(){
        return "authenticated!!";
    }
}
