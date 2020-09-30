package com.melo.project.gamercommunity.Util;

import com.melo.project.gamercommunity.User.UserDto;

import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

public class UserUtil {
    public static int getUserAge(UserDto userDto){
        return Optional.ofNullable(userDto)
                .map(UserDto::getDateOfBirth)
                .map(birthDate -> Period.between(birthDate, LocalDate.now()).getYears())
                .orElse(-1);
    }

}
