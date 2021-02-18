package com.kysh.todo.domain.dto;

import lombok.Data;

import java.util.List;

@Data
public class InitialDisplayDto {

    private List<ProjectDto> projectData;
    private List<TaskDto> taskData;

}
