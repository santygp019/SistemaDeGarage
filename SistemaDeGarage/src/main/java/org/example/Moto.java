package org.example;

public class Moto extends Vehiculo {


    @Override
    public double calcularCosto() {
        return 700;
    }

    @Override
    public int getEspacioOcupado() {
        return 1;
    }

}
