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

}
