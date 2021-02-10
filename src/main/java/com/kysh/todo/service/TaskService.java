package com.kysh.todo.service;

import com.kysh.todo.domain.dto.TaskDto;
import com.kysh.todo.domain.entity.Task;
import com.kysh.todo.domain.repository.TaskDao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    TaskDao taskDao;

    public TaskDto getTaskData() {
        TaskDto taskDto = new TaskDto();
        Optional<Task> allTask = taskDao.selectAllTask();
        BeanUtils.copyProperties(allTask.orElse(new Task()), taskDto);
        return taskDto;
    }
}
