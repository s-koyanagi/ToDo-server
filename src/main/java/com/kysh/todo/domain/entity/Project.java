package com.kysh.todo.domain.entity;

import lombok.Getter;
import lombok.Setter;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

@Getter
@Setter
@Entity
@Table(name = "projects")
public class Project {

    @Id
    @Column(name = "project_id")
    private Integer projectId;
    @Column(name = "project_name")
    private String projectName;
    @Column(name = "color")
    private String color;

}
