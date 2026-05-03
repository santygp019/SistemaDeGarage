package org.example;

public abstract class Vehiculo implements Calculable, Mostrable {
    private String marca;
    private String modelo;
    private String patente;
    private int horasEstimadas;

    public Vehiculo(String modelo, String marca, String patente, int horasEstimadas) {
        this.modelo = modelo;
        this.marca = marca;
        this.patente = patente;
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

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public abstract double calcularCosto();

    public abstract int getEspacioOcupado();

    public String getTipoVehiculo(){return getClass().getSimpleName();}

    public double calcularTarifa() {
        return getHorasEstimadas() * calcularCosto();
    }
    public void mostrarInfo(){
        System.out.println("Tipo: " + getTipoVehiculo());
        System.out.println("Patente: " + getPatente());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo " + getModelo());
        System.out.println("Horas Estimadas: " + horasEstimadas);
        System.out.println("Espacio ocupado: " + getEspacioOcupado());
        System.out.println("Total a pagar: " + calcularTarifa());
    }


}
