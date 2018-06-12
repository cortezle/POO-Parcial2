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
public class VehiculoFactory implements AbstractFactory{
    
    @Override
    public EdificacionVehiculo getEdificacionVehiculo(String tipo) {
        switch (tipo) {
            case "vh1":
                return new ConstructorDeVehiculos1.ConstructorDeVehiculos1Builder("woodhorse",12,12,23).build();


        }
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
