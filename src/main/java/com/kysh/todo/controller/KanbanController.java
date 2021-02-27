package com.kysh.todo.controller;

import com.kysh.todo.domain.dto.KanbanDto;
import com.kysh.todo.service.ProjectService;
import com.kysh.todo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/kanban")
public class KanbanController {

    @Autowired
    ProjectService projectService;

    @Autowired
    TaskService taskService;

    @RequestMapping(path = "/get-data")
    public ResponseEntity<KanbanDto> getKanbanData(){
        KanbanDto responseData = new KanbanDto();
        responseData.setProjectData(projectService.getProjectData());
        responseData.setTaskData(taskService.getTaskData());
        return ResponseEntity.ok(responseData);
    }

}
