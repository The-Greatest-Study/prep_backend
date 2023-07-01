package com.lgcns.tct_backend.exception.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.lgcns.tct_backend.exception.BusinessException;
import com.lgcns.tct_backend.exception.RestException;
import com.lgcns.tct_backend.model.ErrorCode;

@ControllerAdvice
public class DefaultExceptionAdvice {
        @ExceptionHandler(BusinessException.class)
    protected ResponseEntity<ErrorCode> handleBusinessException(BusinessException e){
        ErrorCode error = e.getError();
        return new ResponseEntity<>(error, error.getHttpStatus());
    }

    @ExceptionHandler(RestException.class)
    protected ResponseEntity<ErrorCode> handleRestException(RestException e){
        ErrorCode error = e.getError();
        return new ResponseEntity<>(error, error.getHttpStatus());
    }

    @ExceptionHandler(Exception.class)
    protected ResponseEntity<ErrorCode> handleException(Exception e){
        e.printStackTrace();
        
        ErrorCode error = ErrorCode.INTERNAL_SERVER_ERROR;
        return new ResponseEntity<>(error, error.getHttpStatus());
    }
}
