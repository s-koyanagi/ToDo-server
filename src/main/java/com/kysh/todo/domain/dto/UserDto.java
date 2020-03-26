package com.kysh.todo.domain.dto;

import lombok.Data;

@Data
public class UserDto {
    // ID
    private Integer id;
    // フルネーム
    private String fullName;
    // 名前
    private String firstName;
    // 苗字
    private String lastName;
    // メールアドレス
    private String email;
    // 権限フラグ
    private String adminFlag;
}
