package com.lgcns.tct_backend.exception;

import com.lgcns.tct_backend.model.ErrorCode;

import lombok.Getter;

@Getter
public class RestException extends RuntimeException {
        private ErrorCode error;

    public RestException(ErrorCode error){
        this.error = error;
    }
}
