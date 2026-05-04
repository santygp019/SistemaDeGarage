package org.example.excepciones;

public class VehiculoNoEncontradoException extends RuntimeException {
    public VehiculoNoEncontradoException(String message) {
        super(message);
    }
}
