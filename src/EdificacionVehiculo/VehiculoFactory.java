/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionVehiculo;

import AbstractFactory.AbstractFactory;
import EdficicacionRecurso.EdificacionRecurso;
import EdificacionMilicia.EdificacionMilicia;
import EdificacionMilicia.Soldado;

/**
 *
 * @author Lucho
 */
public class VehiculoFactory implements AbstractFactory {
     
    @Override
    public EdificacionVehiculo getEdificacionVehiculo(String tipo) {
       int i=1;

        
        switch (tipo) {
            case "dothraki":
                         i++;
                return new ConstructorDeVehiculos1.ConstructorDeVehiculos1Builder("woodhorse", 12, 12, 3,i).build();
                
            case "nightswatch":
                         i++;
                return new ConstructorDeVehiculos1.ConstructorDeVehiculos1Builder("Wolve", 12, 18, 1,i).build();
            case "thechildren":
                         i++;
                return new ConstructorDeVehiculos1.ConstructorDeVehiculos1Builder("Birdol", 10, 12, 2,i).build();
            case "dothraki2":
                         i++;
                return new ConstructorDeVehiculos1.ConstructorDeVehiculos1Builder("Dothride", 12, 12, 3,i).build();
            case "nightswatch2":
                         i++;
                return new ConstructorDeVehiculos1.ConstructorDeVehiculos1Builder("Horsebourn", 12, 18, 1,i).build();
            case "thechildren2":
                         i++;
                return new ConstructorDeVehiculos1.ConstructorDeVehiculos1Builder("Unicoh", 10, 12, 2,i).build();

        }
               
     
        //
            return null;
    }

    @Override
    public EdificacionRecurso getEdificacionRecurso(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EdificacionMilicia getEdificacionMilicia(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
