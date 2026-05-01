package org.example;

public class Auto extends Vehiculo {

    public Auto(String modelo, String marca, String patente, String espacio, double horasEstimadas) {
        super(modelo, marca, patente, espacio, horasEstimadas);
    }

    @Override
    public double calcularCosto() {
        return 1000;
    }

    @Override
    public int getEspacioOcupado() {
        return 2;

    }
}