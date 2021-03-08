package com.kysh.todo.service;

import com.kysh.todo.domain.dto.CategoryDto;
import com.kysh.todo.domain.repository.CategoryDao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryDao categoryDao;

    public List<CategoryDto> getCategoryData(){
        List<CategoryDto> allCategoryData = new ArrayList<>();
        categoryDao.selectAllCategory().forEach(i -> {
            CategoryDto dto = new CategoryDto();
            BeanUtils.copyProperties(i, dto);
            allCategoryData.add(dto);
        });
        return allCategoryData;
    }
}
