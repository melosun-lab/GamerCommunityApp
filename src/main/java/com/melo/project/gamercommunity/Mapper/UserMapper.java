package com.melo.project.gamercommunity.Mapper;

import com.melo.project.gamercommunity.Hobby.Hobby;
import com.melo.project.gamercommunity.User.Address;
import com.melo.project.gamercommunity.User.User;
import com.melo.project.gamercommunity.User.UserDto;

public class UserMapper {
    public static User from(UserDto userDto){
        return User.builder()
                .name(userDto.getName())
                .surname(userDto.getSurname())
                .password(userDto.getPassword())
                .email(userDto.getEmail())
                .address(Address.builder()
                        .country(userDto.getCountry())
                        .state(userDto.getState())
                        .city(userDto.getCity())
                        .build()
                )
                .gender(userDto.getGender())
                .dateOfBirth(userDto.getDateOfBirth())
                .build();
    }

    public static UserDto from(User user){
        return UserDto.builder()
                .name(user.getName())
                .surname((user.getSurname()))
                .password(user.getPassword())
                .email(user.getEmail())
                .country(user.getAddress().getCountry())
                .city(user.getAddress().getCity())
                .state(user.getAddress().getState())
                .gender(user.getGender())
                .dateOfBirth(user.getDateOfBirth())
                .build();
    }
}
