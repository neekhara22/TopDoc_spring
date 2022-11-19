package com.app.topdoc.customGlobalExecption;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import java.util.*;

/* @Author("Harsh Singh"), @CreateDate("16 sep 2022"),
    @Description("To handle all the exceptions for the app") */
@ControllerAdvice
public class ExceptionHelper extends ResponseEntityExceptionHandler {
    private static List<String> chargebeeConfigErrors = new ArrayList<>();
    private static Map<String,String> chargebeeVariableMappings = new HashMap<>();
    static {
        chargebeeConfigErrors.add("api_authentication_failed");
        chargebeeConfigErrors.add("configuration_incompatible");
        chargebeeVariableMappings.put("vat_number", "abn");
        chargebeeVariableMappings.put("VAT", "abn");
        chargebeeVariableMappings.put("zip", "postcode");
    }
    public static final Logger LOGGER_EXCEPTION_HELPER = LoggerFactory.getLogger(ExceptionHelper.class);
    @Autowired
    ErrorResponse errorResponse;

    @ExceptionHandler(value = { DataErrorException.class })
    public ResponseEntity<ErrorResponse> handleApiException(DataErrorException ex) {
        LOGGER_EXCEPTION_HELPER.error("api exception: ",ex);
        errorResponse.setErrorCode(ex.getErrorCode());
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setHttpCode(ex.getHttpStatusCode());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = { Exception.class })
    public ResponseEntity<ErrorResponse> handleException(Exception ex) {
        LOGGER_EXCEPTION_HELPER.error("Exception: ",ex.getMessage());
        ex.printStackTrace();
        errorResponse.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        errorResponse.setMessage("Internal Server Error. Reason: "+ex.getLocalizedMessage());
        errorResponse.setHttpCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}