package com.kysh.todo.domain.repository;

import com.kysh.todo.domain.entity.Status;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@Dao
@ConfigAutowireable
public interface StatusDao {

    @Select
    List<Status> selectAllStatus();

}
