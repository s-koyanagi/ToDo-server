package com.kysh.todo.auth;

import com.kysh.todo.domain.dto.UserDto;
import com.kysh.todo.domain.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/auth")
public class AuthController {

    @RequestMapping(path = "/verify")
    public ResponseEntity<UserDto> verifyAuthentication(@AuthenticationPrincipal User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setEmail(user.getEmail());
        userDto.setFullName(user.getFullName());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setAdminFlag(user.getAdminFlag());
        return ResponseEntity.ok(userDto);
    }
}
