package com.melo.project.gamercommunity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDto getUser(@RequestParam(value = "email") String email){
        return userService.getUserByEmail(email);
    }

    @PutMapping
    public UserDto updateUser(@RequestBody @Valid UserDto userDto){
        return userService.updateUser(userDto);
    }
}
