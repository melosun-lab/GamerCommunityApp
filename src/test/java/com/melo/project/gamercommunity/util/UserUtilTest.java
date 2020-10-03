package com.melo.project.gamercommunity.util;

import com.melo.project.gamercommunity.User.User;
import com.melo.project.gamercommunity.User.UserDto;
import com.melo.project.gamercommunity.Util.UserUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UserUtilTest {

    @Test
    void getUserAgeSuccess() {
        UserDto userDto = UserDto.builder().dateOfBirth(LocalDate.of(1990, 4, 20)).build();

        int age = UserUtil.getUserAge(userDto);

        Assertions.assertEquals(30, age);
    }

    @Test
    void getUserAgeFailure() {
        UserDto userDto = UserDto.builder().build();

        int age = UserUtil.getUserAge(userDto);

        Assertions.assertEquals(-1, age);
    }
}
