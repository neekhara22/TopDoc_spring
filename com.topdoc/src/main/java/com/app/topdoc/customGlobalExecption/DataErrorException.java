package com.app.topdoc.customGlobalExecption;

/* @Author("Harsh Singh"), @CreateDate("16 sept 2022"),
    @Description("To handle data error exception") */
public class DataErrorException extends RuntimeException{
    private String errorCode;
    private String message;
    private int httpStatusCode;
    public DataErrorException(String exmessage) {
        super(exmessage);
        message = message;
    }
    public DataErrorException(String exmessage, String errorcode, int code) {
        super(exmessage);
        message = exmessage;
        errorCode = errorcode;
        httpStatusCode = code;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }
}
