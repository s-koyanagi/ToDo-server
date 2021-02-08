package com.kysh.todo.domain.entity;

import lombok.Getter;
import lombok.Setter;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="tasks")
public class Task {

    @Id
    @Column(name = "task_id")
    private Integer taskId;
    @Column(name = "project_id")
    private Integer projectId;
    @Column(name = "subject")
    private String subject;
    @Column(name = "status_id")
    private Integer statusId;
    @Column(name = "dead_line")
    private Date deadLine;

}
