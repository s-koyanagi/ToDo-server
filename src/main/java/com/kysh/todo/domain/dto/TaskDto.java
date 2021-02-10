package com.kysh.todo.domain.dto;

import lombok.Data;

import java.util.Date;

@Data
public class TaskDto {

    private Integer taskId;
    private Integer projectId;
    private String subject;
    private Integer statusId;
    private Date deadLine;

}
