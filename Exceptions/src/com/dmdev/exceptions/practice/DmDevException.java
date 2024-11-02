package com.dmdev.exceptions.practice;

public class DmDevException extends RuntimeException{
    public DmDevException() {
    }

    public DmDevException(String message) {
        super(message);
    }

    public DmDevException(Throwable cause) {
        super(cause);
    }
}
