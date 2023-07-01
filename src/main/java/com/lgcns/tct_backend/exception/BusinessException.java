package com.lgcns.tct_backend.exception;

import com.lgcns.tct_backend.model.ErrorCode;

import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException{
    private ErrorCode error;

    public BusinessException(ErrorCode error){
        this.error = error;
    }
}
