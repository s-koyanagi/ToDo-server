package com.kysh.todo.controller;

import com.kysh.todo.domain.dto.InitialDisplayDto;
import com.kysh.todo.service.ProjectService;
import com.kysh.todo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/init")
public class InitialController {

    @Autowired
    ProjectService projectService;

    @Autowired
    TaskService taskService;

    @RequestMapping(path = "/get-data")
    public ResponseEntity<InitialDisplayDto> getInitData(){
        InitialDisplayDto responseData = new InitialDisplayDto();
        responseData.setProjectData(projectService.getProjectData());
        responseData.setTaskData(taskService.getTaskData());
        return ResponseEntity.ok(responseData);
    }

}
