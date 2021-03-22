package com.kysh.todo.controller;

import com.kysh.todo.domain.dto.TaskDto;
import com.kysh.todo.domain.form.TaskForm;
import com.kysh.todo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/task")
public class TaskController {

    @Autowired
    TaskService taskService;

    @RequestMapping(path = "/get-list")
    public ResponseEntity<List<TaskDto>> getTaskList(){
        return ResponseEntity.ok(taskService.getTaskData());
    }

    @RequestMapping(path = "/create")
    public ResponseEntity<List<TaskDto>> createTask(@RequestParam("taskForm")TaskForm taskForm) {
        return ResponseEntity.ok(taskService.createTask(taskForm));
    }
}
