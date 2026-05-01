package org.example;

public class Moto extends Vehiculo {

    public Moto(String modelo, String marca, String patente, String espacio, double horasEstimadas) {
        super(modelo, marca, patente, espacio, horasEstimadas);
    }

    @Override
    public double calcularCosto() {
        return 700;
    }

    @Override
    public int getEspacioOcupado() {
              return 1;
    }

}
