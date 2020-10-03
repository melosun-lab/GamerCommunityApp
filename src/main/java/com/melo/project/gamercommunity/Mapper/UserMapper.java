package com.melo.project.gamercommunity.Mapper;

import com.melo.project.gamercommunity.Hobby.Hobby;
import com.melo.project.gamercommunity.User.Address;
import com.melo.project.gamercommunity.User.User;
import com.melo.project.gamercommunity.User.UserDto;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
        return user == null ? null : UserDto.builder()
                .id(Optional.ofNullable(user.getId()).orElse(null))
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

    public static List<UserDto> from(List<User> userList) {
        return userList.stream()
                .map(UserMapper::from)
                .collect(Collectors.toList());
    }
}
