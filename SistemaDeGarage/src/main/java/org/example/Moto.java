package org.example;

public class Moto extends Vehiculo {

    public Moto(String modelo, String marca, String patente, double horasEstimadas) {
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

    @Override
    public String getTipoVehiculo() {
        return "Moto";
    }

    @Override
    public double calcularTarifa() {
        return getHorasEstimadas() * calcularCosto();
    }

}
