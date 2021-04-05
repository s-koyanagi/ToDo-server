package com.kysh.todo.domain.form;

import lombok.Data;

import java.time.LocalDate;

@Data
public class TaskForm {

    private Integer categoryId;

    private String subject;

    private LocalDate deadLine;
}
