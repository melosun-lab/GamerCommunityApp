package com.melo.project.gamercommunity.Register;

import com.melo.project.gamercommunity.User.User;
import com.melo.project.gamercommunity.User.UserDto;
import com.melo.project.gamercommunity.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    @Autowired
    UserService userService;

    public UserDto registerUser(UserDto userDto){
        return userService.createUser(userDto);
    }
}
