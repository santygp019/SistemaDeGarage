package org.example;


import java.sql.SQLOutput;
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
                        int horas = Integer.parseInt(scanner.nextLine());

                        Vehiculo nuevoVehiculo = null;
                        if (tipoVe.equals("1")){
                            nuevoVehiculo = new Auto(modelo, marca, patente, horas);
                        }else if (tipoVe.equals("2")) {
                            nuevoVehiculo = new Moto(modelo, marca, patente, horas);
                        } else if (tipoVe.equals("3")) {
                            nuevoVehiculo = new Camion(modelo, marca, patente, horas);
                        }else {
                            System.out.println("Tipo de Vehiculo Invalido.");
                        }
                        if (nuevoVehiculo != null){
                            garage.ingresarVehiculo(nuevoVehiculo);
                        }
                        break;

                    case 2:
                        System.out.println("\n--- Registrar Salida ---");
                        System.out.print("Ingrese la patente del vehículo que sale: ");
                        String patSalida = scanner.nextLine();
                        garage.egresoVehiculo(patSalida);
                        break;
                    case 3 :
                        garage.listarVehiculos();
                        break;
                    case 4:
                        garage.estadoGarage();
                        break;
                    case 5:
                        garage.reporteVehiculo();
                        break;
                    case 6:
                        System.out.println("Salir del Programa");
                        break;

                    default:
                        System.out.println("Opciones no valida, intente nuevamente ");
                    }
                }catch (NumberFormatException e){
                System.out.println("Error dato incorrecto, debe ingresar un valor numerico valido " +e);
            }
                catch (IllegalArgumentException e){
                    System.out.println("Error de validacion " + e.getMessage());
                }
                catch (PatenteDuplicadaException | GarageLlenoException | HorasInvalidasException | VehiculoNoEncontradoException e){
                    System.out.println(e.getMessage());
                }catch (Exception e ){
                System.out.println("Ocurrio un error y hasta aca llegamos!");
            }
            }
        }

    }

