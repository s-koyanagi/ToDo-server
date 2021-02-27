package com.kysh.todo.domain.dto;

import lombok.Data;

import java.util.List;

@Data
public class KanbanDto {

    private List<ProjectDto> projectData;
    private List<TaskDto> taskData;
    private List<StatusDto> statusData;

}
