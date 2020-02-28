package com.kysh.todo.auth;

import com.kysh.todo.domain.entity.User;
import com.kysh.todo.domain.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class AuthService implements UserDetailsService {

    @Autowired
    UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        String email = Optional.ofNullable(id).orElseThrow(() -> new UsernameNotFoundException("メールアドレスが未入力です。"));
        User user = userDao.selectByEmail(email).orElseThrow(()-> new UsernameNotFoundException("入力内容が不正です。"));
        return user;
    }
}