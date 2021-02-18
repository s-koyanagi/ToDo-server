package com.kysh.todo.service;

import com.kysh.todo.domain.dto.ProjectDto;
import com.kysh.todo.domain.repository.ProjectDao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {

    @Autowired
    ProjectDao projectDao;

    public List<ProjectDto> getProjectData(){
        List<ProjectDto> allProjectData = new ArrayList<>();
        projectDao.selectAllProject().forEach(i -> {
            ProjectDto dto = new ProjectDto();
            BeanUtils.copyProperties(i, dto);
            allProjectData.add(dto);
        });
        return allProjectData;
    }
}
