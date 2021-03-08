package com.kysh.todo.domain.dto;

import lombok.Data;

import java.util.List;

@Data
public class KanbanDto {

    private List<CategoryDto> categoryData;
    private List<TaskDto> taskData;
    private List<StatusDto> statusData;

}
