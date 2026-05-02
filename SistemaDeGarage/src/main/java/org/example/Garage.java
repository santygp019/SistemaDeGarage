package org.example;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private List<Vehiculo> listaVehiculos = new ArrayList<>();
    private int capacidadMaxima;

    public Garage(int capacidadMaxima) {
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
        if (vehiculo.getHorasEstimadas()<=0){
            throw new HorasInvalidasException("Las horas deben ser mayores a 0");
        }
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
        System.out.println("Resumen de salida");
        vehiculo.mostrarInfo();
        System.out.println("Vehiculo egresado con exito ");
      }

      public void listarVehiculos(){
        if (listaVehiculos.isEmpty()){
            System.out.println("No hay Vehiculos en el Garage");
            return;
        }
          System.out.println("\n Vehiculos Estacionados");
        for (Vehiculo vehiculo : listaVehiculos){
            System.out.println(vehiculo.getTipoVehiculo() + " | Patente: " + vehiculo.getPatente() + " | Horas: " + vehiculo.getHorasEstimadas());
        }
      }


    public void estadoGarage(){
        System.out.println("\n Estado Actual Del Garage");
        System.out.println("Capacidad total: " + capacidadMaxima);
        System.out.println("Espacio Ocupado: " + getEspacioTotalOcupado());
        System.out.println("Espacio Disponible: " + getEspacioDisponible());
        System.out.println("Cantidad de Vehiculos: " + listaVehiculos.size());
    }
    }

