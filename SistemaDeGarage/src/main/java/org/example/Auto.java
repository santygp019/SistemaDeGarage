package org.example;

public class Auto extends Vehiculo {

    public Auto(String modelo, String marca, String patente,int horasEstimadas) {
        super(modelo, marca, patente, horasEstimadas);
    }


    @Override
    public double calcularCosto() {
        return 1000;
    }

    @Override
    public int getEspacioOcupado() {
        return 2;

    }

    @Override
    public String getTipoVehiculo() {
        return "Auto";
    }

}