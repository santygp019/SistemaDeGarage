package org.example;

public class Camion extends Vehiculo{


    public Camion(String modelo, String marca, String patente, String espacio, double horasEstimadas) {
        super(modelo, marca, patente, espacio, horasEstimadas);
    }

    @Override
    public double calcularCosto() {
        return 1500;
    }

    @Override
    public int getEspacioOcupado() {
        return 4;
    }


}
