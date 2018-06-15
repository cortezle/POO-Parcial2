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
import luiscortez.sworld.Jugador;
import luiscortez.sworld.NombreRaza;

/**
 *
 * @author Lucho
 */


public class MenuJuego {
        AbstractFactory reino;
        Jugador jug1 = new Jugador();
        Jugador jug2 = new Jugador();
        private ListaDeCreacion listaCreacion1 = new ListaDeCreacion();
        public static int fases=0;
        NombreRaza p= new NombreRaza();
        String nick1,nick2,raza1,raza2,prueba;
    public String EleccionDeRazaNick() {

        Scanner option = new Scanner(System.in);

        System.out.println("*====== Bienvenido al Juego =======*\n\n");
        System.out.println("*====== Escribir Nick de Jug =======*");
        nick1=option.nextLine();

        System.out.println("\n");
        System.out.println("Elegi tu raza: \n");
        System.out.println("1. Dothraki.\n"
                + "2. NightsWatch.\n"
                + "3. TheChildren \n\n"
                + "4. Salir \n\n"
                + "Opcion: ");
        System.out.println(nick1 + " elegi tu raza: ");
        raza1=option.nextLine();

        switch (raza1) {
            case "1":
                System.out.println(nick1 + ": " + p.getRaza1());
                raza1 = p.getRaza1();
                System.out.println(prueba);
                break;
            case "2":
                System.out.println(nick1 + ": " + p.getRaza2());
                raza1 = p.getRaza2();
                break;
            case "3":
                System.out.println(nick1 + ": " + p.getRaza3());
                raza1 = p.getRaza3();
                break;
            default:

                break;

        }

        return raza1;
    }
        
        public void Menu_Opciones() {
        System.out.println("*====== Bienvenido al Juego=======*\n\n"
                + "1.Crear EdificacionDeRecurso tipo 1.\n"
                + "2.Crear EdificacionDeRecurso tipo2.\n"
                + "3.Recolectar Recurso1.\n"
                + "4.Recolectar Recurso2\n"
                + "5.Crear Soldado\n"
                + "6.Crear EdificacionMilicia\n"
                + "7.Atacar\n"
                + "8.CrearVehiculo1\n"
                + "9.CrearVehiculo2\n"
                + "10.Mostrar Soldados\n"
                + "11.Mostrar Vehiculos\n"
                + "12.Mostrar Recursos\n"
                + "13.Mostrar Reino Contrario\n"
                + "14. Terminar turno \n"
                + "15. FINJUEGO \n"
                + "Opcion: ");
    }
        
        public int Opcion_Seleccionada(String raza1){
            int opcion=0;
                    Scanner option = new Scanner(System.in);
            while (opcion != 14) {
            Menu_Opciones();
            try {
                opcion = option.nextInt();
                switch (opcion)
                        {
                    
                    case 1:
                        System.out.println("Crear EdificacionDeRecurso tipo 1");
                        listaCreacion1.AgregarRecursoJug1(raza1);
                        System.out.println("Se creo edificacion de recurso");

                        break;
                    case 2:
                        System.out.println("Crear EdificacionDeRecurso tipo 2");
                        listaCreacion1.AgregarRecursoJug1(raza1+"2");
                        System.out.println("Se creo edificacion de recurso");

                        break;
                    case 3:
                        System.out.println("Recolectar Recurso1");

                        break;
                    case 4:
                        System.out.println("Recolectar Recurso2");

                        break;
                    case 5:

                        listaCreacion1.AgregarSoldadoJug1(raza1);
                        System.out.println("se agrego soldado "+raza1+"a tu ejercito");
                        break;
              
                         
                        
                    case 6:
                        System.out.println("Crear EdificacionMilicia");
                        listaCreacion1.AgregarEdMilicia();
                        break;
                    case 7:
                        System.out.println("Atacar");
                        break;
                    case 8:
                        System.out.println("Vehiculotipo2");
                        listaCreacion1.AgregarVehiculoJug1(raza1);
                        System.out.println("Agregado");
                        break;
                    case 9:
                        System.out.println("Vehiculotipo2");
                        listaCreacion1.AgregarVehiculoJug1(raza1+"2");
                        System.out.println("Agregado");
                        break;
                    case 10:
                        listaCreacion1.Mostrar_Soldado();
                        break;
                    case 11:
                        listaCreacion1.Mostrar_Vehiculo();
                        break;
                    case 12:
                        listaCreacion1.Mostrar_Recurso();
                        break;
                    case 13:
                        System.out.println("Reino contrario");
                        listaCreacion1.Mostrar_Recurso2();
                        listaCreacion1.Mostrar_Soldado2();
                        listaCreacion1.Mostrar_Vehiculo2();
                        break;
                    case 14:
                        System.out.println(" tu turno!");
                        return 2;
                    case 15:
                        return 3;
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
        return 3;
        }
        public int Opcion_Seleccionada2(String raza1){
            int opcion=0;
                    Scanner option = new Scanner(System.in);
            while (opcion != 14) {
            Menu_Opciones();
            try {
                opcion = option.nextInt();
                switch (opcion)
                        {
                    
                    case 1:
                        System.out.println("Crear EdificacionDeRecurso tipo 1");
                        listaCreacion1.AgregarRecursoJug2(raza1);
                        System.out.println("Se creo edificacion de recurso");

                        break;
                    case 2:
                        System.out.println("Crear EdificacionDeRecurso tipo 2");
                        listaCreacion1.AgregarRecursoJug2(raza1+"2");
                        System.out.println("Se creo edificacion de recurso");

                        break;
                    case 3:
                        System.out.println("Recolectar Recurso1");

                        break;
                    case 4:
                        System.out.println("Recolectar Recurso2");

                        break;
                    case 5:

                        listaCreacion1.AgregarSoldadoJug2(raza1);
                        System.out.println("se agrego soldado "+raza1+"a tu ejercito");
                        break;
              
                         
                        
                    case 6:
                        System.out.println("Crear EdificacionMilicia");
                        listaCreacion1.AgregarEdMilicia();
                        break;
                    case 7:
                        System.out.println("Atacar");
                        break;
                    case 8:
                        System.out.println("Vehiculotipo2");
                        listaCreacion1.AgregarVehiculoJug2(raza1);
                        System.out.println("Agregado");
                        break;
                    case 9:
                        System.out.println("Vehiculotipo2");
                        listaCreacion1.AgregarVehiculoJug2(raza1+"2");
                        System.out.println("Agregado");
                        break;
                    case 10:
                        listaCreacion1.Mostrar_Soldado2();
                        break;
                    case 11:
                        listaCreacion1.Mostrar_Vehiculo2();
                        break;
                    case 12:
                        listaCreacion1.Mostrar_Recurso2();
                        break;
                    case 13:
                        System.out.println("Reino contrario");
                        listaCreacion1.Mostrar_EdMilicia();
                        listaCreacion1.Mostrar_Recurso();
                        listaCreacion1.Mostrar_Soldado();
                        listaCreacion1.Mostrar_Vehiculo();

                        
                    case 14:
                        System.out.println(" tu turno!");
                        return 2;
                    case 15:
                        return 3;

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
        return 3;
        }

        
        
        /*public void MenuJugadores(){
            int opcion=0;
            Scanner option= new Scanner(System.in);
            while(opcion!=10){
                //Opcion_SeleccionadaJug2();
                try{
                    opcion = option.nextInt();
                    Opcion_Seleccionada();
                }catch (Exception e) {
                System.err.println("Lo que se ha ingresado puede que no sea un numero\n"
                        + "Por favor ingrese un numero\n");
                option.nextLine();
            }
            }
        }*/
}
