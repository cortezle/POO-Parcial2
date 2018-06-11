/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import EdificacionMilicia.EdificacionMilicia;
import java.util.Scanner;
import luiscortez.sworld.Dothraki;

/**
 *
 * @author Lucho
 */
public class MenuJuego {
        AbstractFactory reino;
        public void EleccionDeRazaNick() {
            
             Scanner option = new Scanner(System.in);
             String nick1,nick2,raza1,raza2;
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
                    System.out.println(nick1+ ": "+"Dothraki");
                    Dothraki d=new Dothraki();
                    break;
                case "2":
                    System.out.println(nick1+ ": "+"NightsWatch");
                    break;
                case "3":
                    System.out.println(nick1+ ": "+"TheChildren");
                    break;
                default:
                    
                    break;
                    
            }
            switch(raza2){
                case "1":
                    System.out.println(nick2+ ": "+"Dothraki");
                    break;
                case "2":
                    System.out.println(nick2+ ": "+"NightsWatch");
                    break;
                case "3":
                    System.out.println(nick2+ ": "+"TheChildren");
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
                + "8. Salir \n\n"
                + "Opcion: ");
    }
        
        public void Opcion_Seleccionada(){
            int opcion=0;
                    Scanner option = new Scanner(System.in);
            while (opcion != 8) {
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
                        AbstractFactory raza;
                        System.out.println("Crear Soldado");
                        raza= FactoryDeEdificaciones.getAbstractFactory("milicia");
                        EdificacionMilicia soldado1 = raza.getEdificacionMilicia("soldado");
                        System.out.println(soldado1.toString());

                        break;
                    case 6:
                        System.out.println("Crear EdificacionMilicia");

                        break;
                    case 7:
                        System.out.println("Atacar");

                        break;
                    case 8:
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
}
        }
}
