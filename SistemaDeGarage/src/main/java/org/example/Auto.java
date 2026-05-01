package org.example;

public class Auto extends Vehiculo {


    @Override
    public double calcularCosto() {
        return 1000;
    }

    @Override
    public int getEspacioOcupado() {
        return 2;
    }

}
