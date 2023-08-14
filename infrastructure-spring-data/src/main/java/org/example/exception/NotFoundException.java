package org.example.exception;

public class NotFoundException extends RuntimeException{
    public NotFoundException() {
        super("Not found exception");
    }
}
