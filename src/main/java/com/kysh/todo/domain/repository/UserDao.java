package com.kysh.todo.domain.repository;

import com.kysh.todo.domain.entity.User;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.Optional;

@Dao
@ConfigAutowireable
public interface UserDao {

    @Select
    Optional<User> selectByEmail(String email);
}
