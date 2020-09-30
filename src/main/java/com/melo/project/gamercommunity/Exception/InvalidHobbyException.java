package com.melo.project.gamercommunity.Exception;

import org.springframework.http.HttpStatus;

public class InvalidHobbyException extends Exception{
    private HttpStatus errorCode;
    private String errorMessage;

    public InvalidHobbyException(HttpStatus errorCode, String errorMessage) {
        super();
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
