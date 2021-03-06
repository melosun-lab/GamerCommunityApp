package com.melo.project.gamercommunity.Exception;

import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Getter
@ToString
public class InvalidUserException extends InvalidBaseException {

    public InvalidUserException(HttpStatus errorCode, String errorMessage) {
        super(errorCode, errorMessage);
    }
}
