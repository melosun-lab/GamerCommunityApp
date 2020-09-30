package com.melo.project.gamercommunity.Validation;

import com.melo.project.gamercommunity.Constant.UserValidatorConstant;
import com.melo.project.gamercommunity.Exception.InvalidUserException;
import com.melo.project.gamercommunity.User.UserDto;
import com.melo.project.gamercommunity.User.UserService;
import com.melo.project.gamercommunity.Util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class UserValidator {

    @Autowired
    UserService userService;

    public void validateRegisterUser(UserDto userDto) throws InvalidUserException{
        if (userService.getUserByEmail(userDto.getEmail()) != null){
            throw new InvalidUserException(HttpStatus.BAD_REQUEST, UserValidatorConstant.USER_EMAIL_ALREADY_EXIST);
        }

        if (notBetweenYearRange(UserUtil.getUserAge(userDto),
                UserValidatorConstant.LOWER_AGE_BOUND,
                UserValidatorConstant.UPPER_AGE_BOUND)) {
            throw new InvalidUserException(HttpStatus.BAD_REQUEST, UserValidatorConstant.USER_AGE_IS_WRONG);
        }
    }

    private boolean betweemYearRange(int age, int lowerBoundInclusive, int upperBoundInclusive){
        return age >= lowerBoundInclusive && age <= upperBoundInclusive;
    }
    private boolean notBetweenYearRange(int age, int lowerBoundInclusive, int upperBoundInclusive){
        return !betweemYearRange(age, lowerBoundInclusive, upperBoundInclusive);
    }
}
