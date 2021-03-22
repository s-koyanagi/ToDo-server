package com.kysh.todo.service;

import com.kysh.todo.domain.dto.TaskDto;
import com.kysh.todo.domain.entity.Task;
import com.kysh.todo.domain.form.TaskForm;
import com.kysh.todo.domain.repository.TaskDao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    TaskDao taskDao;

    Integer INIT_STATE_VALUE = 1;

    public List<TaskDto> getTaskData() {
        List<TaskDto> allTaskData = new ArrayList<>();
        taskDao.selectAllTask().forEach(i -> {
            TaskDto dto = new TaskDto();
            BeanUtils.copyProperties(i, dto);
            allTaskData.add(dto);
        });
        return allTaskData;
    }

    public List<TaskDto> createTask(TaskForm taskForm) {
        Task task = new Task();
        task.setStatusId(INIT_STATE_VALUE);
        BeanUtils.copyProperties(taskForm,task);
        taskDao.insertTask(task);
        return this.getTaskData();
    }
}
