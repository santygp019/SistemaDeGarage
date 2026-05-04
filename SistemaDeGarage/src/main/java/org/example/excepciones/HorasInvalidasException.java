package org.example.excepciones;

public class HorasInvalidasException extends RuntimeException {
    public HorasInvalidasException(String message) {
        super(message);
    }
}
