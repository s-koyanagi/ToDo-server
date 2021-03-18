package com.kysh.todo.domain.entity;

import lombok.Getter;
import lombok.Setter;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name="tasks")
public class Task {

    @Id
    @Column(name = "task_id")
    private Integer taskId;
    @Column(name = "category_id")
    private Integer categoryId;
    @Column(name = "subject")
    private String subject;
    @Column(name = "status_id")
    private Integer statusId;
    @Column(name = "dead_line")
    private LocalDate deadLine;

}
