package org.example;

public class Camion extends Vehiculo {
    @Override
    public double calcularCosto() {
        return 1500;
    }

    @Override
    public int getEspacioOcupado() {
        return 4;
    }


}
