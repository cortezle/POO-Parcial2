/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import EdificacionMilicia.EdificacionMilicia;
import EdificacionVehiculo.EdificacionVehiculo;
import EdificacionVehiculo.VehiculoFactory;
import java.util.Scanner;
import luiscortez.sworld.Dothraki;
import luiscortez.sworld.NombreRaza;

/**
 *
 * @author Lucho
 */


public class MenuJuego {
        AbstractFactory reino;
        private ListaDeSoldados listaSoldado = new ListaDeSoldados();
        public static int fases=0;
        NombreRaza p= new NombreRaza();
        String nick1,nick2,raza1,raza2,prueba;
        public void EleccionDeRazaNick() {
            
             Scanner option = new Scanner(System.in);
             
        System.out.println("*====== Bienvenido al Juego =======*\n\n");
        System.out.println("*====== Escribir Nick de Jug1 =======*");
        nick1=option.nextLine();
        System.out.println("*====== Escribir Nick de Jug2 =======*");
        nick2=option.nextLine();
            System.out.println("\n\n");
                System.out.println( "1. Dothraki.\n"
                + "2. NightsWatch.\n"
                + "3. TheChildren \n\n"
                + "4. Salir \n\n"
                + "Opcion: ");
            System.out.println(nick1 + " elegi tu raza: ");
            raza1=option.nextLine();

            System.out.println(nick2 + " elegi tu raza: ");
            raza2=option.nextLine();
                            switch(raza1){
                case "1":
                    System.out.println(nick1+ ": "+p.getRaza1());
                    raza1=p.getRaza1();
                    System.out.println(prueba);
                    break;
                case "2":
                    System.out.println(nick1+ ": "+p.getRaza2());
                    raza1=p.getRaza2();
                    break;
                case "3":
                    System.out.println(nick1+ ": "+p.getRaza3());
                    raza1=p.getRaza3();
                    break;
                default:
                    
                    break;
                    
            }
            switch(raza2){
                case "1":
                    System.out.println(nick2+ ": "+p.getRaza1());
                    raza2=p.getRaza1();
                    break;
                case "2":
                    System.out.println(nick2+ ": "+p.getRaza2());
                    raza2=p.getRaza2();
                    break;
                case "3":
                    System.out.println(nick2+ ": "+p.getRaza3());
                    raza2=p.getRaza3();
                    break;
                default:
                    
                    break;
                    
            }
            

        }
        
        public void Menu_Opciones() {
        System.out.println("*====== Bienvenido al Juego =======*\n\n"
                + "1.Crear EdificacionDeRecurso tipo 1.\n"
                + "2.Crear EdificacionDeRecurso tipo2.\n"
                + "3.Recolectar Recurso1.\n"
                + "4.Recolectar Recurso2\n"
                + "5.Crear Soldado\n"
                + "6.Crear EdificacionMilicia\n"
                + "7.Atacar\n"
                + "8.CrearEdificacionVehiculo1\n"
                + "9.CrearEdificacionVehiculo2\n"
                + "10. Salir \n\n"
                + "Opcion: ");
    }
        
        public void Opcion_Seleccionada(){
            int opcion=0;
                    Scanner option = new Scanner(System.in);
            while (opcion != 10) {
            Menu_Opciones();
            try {
                opcion = option.nextInt();
                switch (opcion)
                        {
                    
                    case 1:
                        System.out.println("Crear EdificacionDeRecurso tipo 1");


                        break;
                    case 2:
                        System.out.println("Crear EdificacionDeRecurso tipo 2");

                        break;
                    case 3:
                        System.out.println("Recolectar Recurso1");

                        break;
                    case 4:
                        System.out.println("Recolectar Recurso2");

                        break;
                    case 5:
                        
                        listaSoldado.AgregarSoldadoJug1(raza1);
                        listaSoldado.Mostrar_Soldado();
                           break;

                        
                    case 6:
                        System.out.println("Crear EdificacionMilicia");

                        break;
                    case 7:
                        System.out.println("Atacar");
                        break;
                    case 8:
                        System.out.println("Vehiculotipo1\n");
                        AbstractFactory raza;
                        raza = FactoryDeEdificaciones.getAbstractFactory("vehiculo");
                        EdificacionVehiculo veh1 = raza.getEdificacionVehiculo("vh1");
                        System.out.println(veh1.toString());
                        break;
                    case 9:
                        System.out.println("Vehiculotipo2");

                        break;
                    case 10:
                        System.out.println(".....Saliendo del Sistema.....\n");
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                        break;
        
                }
            } catch (Exception e) {
                System.err.println("Lo que se ha ingresado puede que no sea un numero\n"
                        + "Por favor ingrese un numero\n");
                option.nextLine();
            }
            
fases=fases+1;
                System.out.println("Fase: " + fases);
            
            }
        }
        public void Opcion_SeleccionadaJug2(){
            int opcion=0;
                    Scanner option = new Scanner(System.in);
            while (opcion != 10) {
            Menu_Opciones();
            try {
                opcion = option.nextInt();
                switch (opcion)
                        {
                    
                    case 1:
                        System.out.println("Crear EdificacionDeRecurso tipo 1");


                        break;
                    case 2:
                        System.out.println("Crear EdificacionDeRecurso tipo 2");

                        break;
                    case 3:
                        System.out.println("Recolectar Recurso1");

                        break;
                    case 4:
                        System.out.println("Recolectar Recurso2");

                        break;
                    case 5:
                        
                        listaSoldado.AgregarSoldadoJug1(raza1);
                        listaSoldado.Mostrar_Soldado();
                           break;

                        
                    case 6:
                        System.out.println("Crear EdificacionMilicia");

                        break;
                    case 7:
                        System.out.println("Atacar");
                        break;
                    case 8:
                        System.out.println("Vehiculotipo1\n");
                        AbstractFactory raza;
                        raza = FactoryDeEdificaciones.getAbstractFactory("vehiculo");
                        EdificacionVehiculo veh1 = raza.getEdificacionVehiculo("vh1");
                        System.out.println(veh1.toString());
                        break;
                    case 9:
                        System.out.println("Vehiculotipo2");

                        break;
                    case 10:
                        System.out.println(".....Saliendo del Sistema.....\n");
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                        break;
        
                }
            } catch (Exception e) {
                System.err.println("Lo que se ha ingresado puede que no sea un numero\n"
                        + "Por favor ingrese un numero\n");
                option.nextLine();
            }
            
fases=fases+1;
                System.out.println("Fase: " + fases);
            
            }
        }
}
