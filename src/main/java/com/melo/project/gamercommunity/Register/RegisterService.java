package com.melo.project.gamercommunity.Register;

import com.melo.project.gamercommunity.Exception.InvalidUserException;
import com.melo.project.gamercommunity.User.UserDto;
import com.melo.project.gamercommunity.User.UserService;
import com.melo.project.gamercommunity.Validation.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    @Autowired
    UserService userService;

    @Autowired
    UserValidator userValidator;

    public UserDto registerUser(UserDto userDto) throws InvalidUserException {
        userValidator.validateRegisterUser(userDto);
        return userService.createUser(userDto);
    }
}
