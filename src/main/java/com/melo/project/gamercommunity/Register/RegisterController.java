package com.melo.project.gamercommunity.Register;

import com.melo.project.gamercommunity.Exception.InvalidUserException;
import com.melo.project.gamercommunity.User.User;
import com.melo.project.gamercommunity.User.UserDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    RegisterService registerService;

    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public UserDto registerUser(@RequestBody @Valid UserDto userDto) throws InvalidUserException {
        return registerService.registerUser(userDto);
    }
}
