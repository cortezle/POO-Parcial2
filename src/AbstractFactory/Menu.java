/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import java.util.Scanner;

/**
 *
 * @author Lucho
 */
public class Menu {
        AbstractFactory reino;
        public void Menu_Opciones() {
        System.out.println("*====== Bienvenido al Juego =======*\n\n");
        System.out.println("*====== Escribir Nick de Jug1 =======*\n\n");
        
        System.out.println("*====== Escribir Nick de Jug =======*\n\n"
                + "1. Elfo.\n"
                + "2. Orco.\n"
                + "3. Salir \n\n"
                + "Opcion: ");
    }
        
        public void Opcion_Seleccionada(){
            int opcion=0;
                    Scanner option = new Scanner(System.in);
            while (opcion != 5) {
            Menu_Opciones();
            try {
                opcion = option.nextInt();
                switch (opcion)
                        {
                    
                    case 1:

                        break;
                    case 2:

                        break;
                                        case 3:
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
