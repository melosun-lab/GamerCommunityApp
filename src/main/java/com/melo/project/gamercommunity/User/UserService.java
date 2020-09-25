package com.melo.project.gamercommunity.User;

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
        User user = userRepository.findUserByEmail(email);
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setSurname(user.getSurname());
        userDto.setEmail(user.getEmail());

        return userDto;
    }

    public UserDto updateUser(UserDto userDto){
        User user = new User();
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        user.setSurname(userDto.getSurname());
        user.setEmail(userDto.getEmail());
        user.setPassword("pw");
        user.setCountry(userDto.getCountry());
        user.setState(userDto.getState());
        user.setCity(userDto.getCity());
        user.setGender(userDto.getGender());
        user.setDateOfBirth(userDto.getDateOfBirth());

        User updatedUser = userRepository.save(user);

        UserDto updatedUserDto = new UserDto();
        updatedUserDto.setId(updatedUser.getId());
        updatedUserDto.setName(updatedUser.getName());
        updatedUserDto.setSurname(updatedUser.getSurname());
        updatedUserDto.setEmail(updatedUser.getEmail());
        updatedUserDto.setCountry(updatedUser.getCountry());
        updatedUserDto.setState(updatedUser.getState());
        updatedUserDto.setCity(updatedUser.getCity());
        updatedUserDto.setGender(updatedUser.getGender());
        updatedUserDto.setDateOfBirth(updatedUser.getDateOfBirth());

        return updatedUserDto;
    }
}