package com.kysh.todo.service;

import com.kysh.todo.domain.dto.TaskDto;
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

    public List<TaskDto> getTaskData() {
        List<TaskDto> allTaskData = new ArrayList<>();
        taskDao.selectAllTask().forEach(i -> {
            TaskDto dto = new TaskDto();
            BeanUtils.copyProperties(i, dto);
            allTaskData.add(dto);
        });
        return allTaskData;
    }
}
