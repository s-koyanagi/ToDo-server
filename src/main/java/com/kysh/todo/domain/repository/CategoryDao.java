package com.kysh.todo.domain.repository;

import com.kysh.todo.domain.entity.Categories;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@Dao
@ConfigAutowireable
public interface CategoryDao {

    @Select
    List<Categories> selectAllCategory();

}
