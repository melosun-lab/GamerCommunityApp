package com.melo.project.gamercommunity.Validation;

import com.melo.project.gamercommunity.Constant.HobbyValidatorConstant;
import com.melo.project.gamercommunity.Exception.InvalidHobbyException;
import com.melo.project.gamercommunity.Hobby.HobbyDto;
import com.melo.project.gamercommunity.Hobby.HobbyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class HobbyValidator {
    @Autowired
    HobbyService hobbyService;

    public void validateAddHobby(HobbyDto hobbyDto) throws InvalidHobbyException {
        if (hobbyService.getHobby(hobbyDto) != null) {
            throw new InvalidHobbyException(HttpStatus.BAD_REQUEST, HobbyValidatorConstant.HOBBY_ALREADY_EXIST);
        }
    }
}
