package com.kysh.todo.service;

import com.kysh.todo.domain.dto.StatusDto;
import com.kysh.todo.domain.repository.StatusDao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StatusService {

    @Autowired
    StatusDao statusDao;

    public List<StatusDto> getStatusData(){
        List<StatusDto> allStatusData = new ArrayList<>();
        statusDao.selectAllStatus().forEach(i ->{
            StatusDto dto = new StatusDto();
            BeanUtils.copyProperties(i, dto);
            allStatusData.add(dto);
        });
        return allStatusData;
    }

}
