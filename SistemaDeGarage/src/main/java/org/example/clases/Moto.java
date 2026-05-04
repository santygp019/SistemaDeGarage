package org.example.clases;

public class Moto extends Vehiculo {

    public Moto(String modelo, String marca, String patente, int horasEstimadas) {
        super(modelo, marca, patente, horasEstimadas);
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