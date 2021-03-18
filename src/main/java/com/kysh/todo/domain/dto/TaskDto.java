package com.kysh.todo.domain.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class TaskDto {

    private Integer taskId;
    private Integer categoryId;
    private String subject;
    private Integer statusId;
    private LocalDate deadLine;

}
