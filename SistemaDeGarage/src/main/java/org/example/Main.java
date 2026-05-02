package org.example;


import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Garage garage = new Garage(500);
        int opcion = 0;

        while(opcion != 6){
            System.out.println("\n Bienvenido al Sistema de Garage");
            System.out.println("1. Registrar ingreso");
            System.out.println("2. Registrar salida");
            System.out.println("3. Listar vehículos");
            System.out.println("4. Estado del garage");
            System.out.println("5. Reportes");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            try{
                opcion = Integer.parseInt(scanner.nextLine());
                /*
                no esta terminado,
                me faltarian 6 casos de switch, tengo una idea si me lo quieren dejar.
                chilling
                */
                switch (opcion){
                    case 1:
                        System.out.println("Registrar Ingreso");
                        System.out.println("Tipo 1-Auto 2-Moto 3-Camion");
                        String tipoVe = scanner.nextLine();

                        System.out.println("Patente:");
                        String patente = scanner.nextLine();
                        if (patente.trim().isEmpty()) throw new IllegalArgumentException("La patente no puede estar vacía.");

                        System.out.print("Marca: ");
                        String marca = scanner.nextLine();

                        System.out.print("Modelo: ");
                        String modelo = scanner.nextLine();

                        System.out.println("Horas Estimadas: ");
                        double horas = Double.parseDouble(scanner.nextLine());

                        Vehiculo nuevoVehiculo = null;
                        if (tipoVe.equals(1)){
                            nuevoVehiculo = new Auto(modelo, marca, patente, horas);
                        }else if (tipoVe.equals("2")) {
                            nuevoVehiculo = new Moto(modelo, marca, patente, horas);
                        } else if (tipoVe.equals("3")) {
                            nuevoVehiculo = new Camion(modelo, marca, patente, horas);
                        }else {
                            System.out.println("Tipo de Vehiculo Invalido.");
                            break;
                        }
                }
            }
        }

    }
}
