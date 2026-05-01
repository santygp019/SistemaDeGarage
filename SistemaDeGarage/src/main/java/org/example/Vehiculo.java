package org.example;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private String patente;
    private String espacio;
    private double horasEstimadas;

    public Vehiculo(String modelo, String marca, String patente, String espacio, double horasEstimadas) {
        this.modelo = modelo;
        this.marca = marca;
        this.patente = patente;
        this.espacio = espacio;
        this.horasEstimadas = horasEstimadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getEspacio() {
        return espacio;
    }

    public void setEspacio(String espacio) {
        this.espacio = espacio;
    }

    public double getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(double horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public abstract double calcularCosto();

    public abstract int getEspacioOcupado();


}
