package com.melo.project.gamercommunity.User;

import com.melo.project.gamercommunity.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Long getUserIdByEmail(String email){
        return userRepository.findUserByEmail(email).getId();
    }

    public UserDto getUserByEmail(String email){
        return UserMapper.from(userRepository.findUserByEmail(email));
    }

    public UserDto updateUser(UserDto userDto){
        return UserMapper.from(userRepository.save(UserMapper.from(userDto)));
    }

    public UserDto getUserById(Long id){
        return UserMapper.from(userRepository.findUserById(id));
    }

    public UserDto createUser(UserDto userDto){
        return UserMapper.from(userRepository.save(UserMapper.from(userDto)));
    }
}
