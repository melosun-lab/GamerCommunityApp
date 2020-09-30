package com.melo.project.gamercommunity.Exception;

import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Getter
@ToString
public class InvalidUserException extends Exception {
    private HttpStatus errorCode;
    private String errorMessage;

    public InvalidUserException(HttpStatus errorCode, String errorMessage) {
        super();
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
