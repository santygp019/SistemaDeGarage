package org.example;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private String patente;
    private String espacio;
    private double horasEstimadas;

    public Vehiculo(String modelo, String marca, String patente, double horasEstimadas) {
        this.modelo = modelo;
        this.marca = marca;
        this.patente = patente;
        this.espacio = espacio;
        this.horasEstimadas = horasEstimadas;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPatente() {
        return patente;
    }

    public String getEspacio() {
        return espacio;
    }

    public double getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(double horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public abstract double calcularCosto();

    public abstract int getEspacioOcupado();

    public abstract String getTipoVehiculo();

    public abstract double calcularTarifa();

    public void mostrarinfo(){
        System.out.println("Tipo: " + getTipoVehiculo());
        System.out.println("Patente: " + getPatente());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo " + getModelo());
        System.out.println("Horas Estimadas: " + horasEstimadas);
        System.out.println("Espacio ocupado: " + getEspacio());
        System.out.println("Total a pagar" + calcularTarifa());
    }


}
