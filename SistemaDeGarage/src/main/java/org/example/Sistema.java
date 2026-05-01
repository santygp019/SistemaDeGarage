package org.example;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

    private List<Vehiculo> listaVehiculos = new ArrayList<>();

    private int capacidadMaxima;

    public Sistema(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getEspacioTotalOcupado(){
        int ocupado =0;
        for (Vehiculo vehiculo : listaVehiculos){
            ocupado += vehiculo.getEspacioOcupado();
        }
        return ocupado;
    }

    public int getEspacioDisponible(){
        return capacidadMaxima - getEspacioTotalOcupado();
    }


    public Vehiculo buscarVehiculoPorPatente(String patente){
        for (Vehiculo vehiculo : listaVehiculos){
            if(vehiculo.getPatente().equalsIgnoreCase(patente)){
                return vehiculo;
            }
        }
        return null;
    }

    public void ingresarVehiculo(Vehiculo vehiculo) throws PatenteDuplicadaException, GarageLlenoException {
        if(buscarVehiculoPorPatente(vehiculo.getPatente()) != null){
            throw new PatenteDuplicadaException("La patente: " + vehiculo.getPatente() + " esta duplicado ");
        }
        if (vehiculo.getEspacioOcupado() > getEspacioDisponible()){
            throw new GarageLlenoException("El garage no tiene espacio disponible");
        }
        listaVehiculos.add(vehiculo);
        System.out.println("Vehiculo ingresado con exito ");
    }

    public void  egresoVehiculo(Vehiculo vehiculo) throws VehiculoNoEncontradoException {

        if (!listaVehiculos.contains(vehiculo)) {
            throw new VehiculoNoEncontradoException("El vehículo con patente " + vehiculo.getPatente() + " no está en el garage.");
        }
          listaVehiculos.remove(vehiculo);
        System.out.println("Vehiculo egresado con exito ");
      }
    public void estadoGarage(){
        System.out.println("\n Estado Actual Del Garage");
        System.out.println("Capacidad total: " + capacidadMaxima);
        System.out.println("Espacio Ocupado: " + getEspacioTotalOcupado());
        System.out.println("Espacio Disponible: " + getEspacioDisponible());
        System.out.println("Cantidad de Vehiculos: " + listaVehiculos.size());
    }
    }

