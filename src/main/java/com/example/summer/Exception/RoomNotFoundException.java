package com.example.summer.Exception;

import java.util.NoSuchElementException;

public class RoomNotFoundException extends NoSuchElementException {
    private String message;

    public RoomNotFoundException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
