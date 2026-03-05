package com.example.GymNacionApplication.errorResponse;

public class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super(message);
    }
}
