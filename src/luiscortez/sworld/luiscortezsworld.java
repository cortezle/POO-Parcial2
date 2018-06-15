/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luiscortez.sworld;

import AbstractFactory.MenuJuego;
import static java.lang.Boolean.TRUE;



/**
 *
 * @author Lucho
 */
public class luiscortezsworld {
    public static void main(String[] args){
        String raza1,raza2;
        MenuJuego m= new MenuJuego();
       raza1=m.EleccionDeRazaNick();
       raza2=m.EleccionDeRazaNick();
       
       do{
           m.Opcion_Seleccionada(raza1);
           m.Opcion_Seleccionada2(raza2);
       }
        while(m.Opcion_Seleccionada(raza1)!=3);
    
        
                
    
    }

            

}
