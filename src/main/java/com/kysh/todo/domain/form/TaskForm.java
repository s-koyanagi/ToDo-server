package com.kysh.todo.domain.form;

import lombok.Data;

@Data
public class TaskForm {

    private Integer categoryId;

    private String subject;

    private String deadLine;
}
