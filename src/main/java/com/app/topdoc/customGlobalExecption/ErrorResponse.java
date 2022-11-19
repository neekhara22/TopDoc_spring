package com.app.topdoc.customGlobalExecption;

import org.springframework.stereotype.Component;

import java.util.List;

/* @Author("Harsh Singh"), @CreateDate("16 sept 2022"),
    @Description("To handle error response.") */
@Component
public class ErrorResponse {
    private String errorCode;
    private String message;
    private int httpCode;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(int httpCode) {
        this.httpCode = httpCode;
    }
}
