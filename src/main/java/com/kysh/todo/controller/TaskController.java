package com.kysh.todo.controller;

import com.kysh.todo.domain.dto.TaskDto;
import com.kysh.todo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/task")
public class TaskController {

    @Autowired
    TaskService taskService;

    @RequestMapping(path = "/get-data")
    public ResponseEntity<List<TaskDto>>getData(){
        return ResponseEntity.ok(taskService.getTaskData());
    }
}
