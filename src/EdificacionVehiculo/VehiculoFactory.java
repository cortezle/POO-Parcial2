/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionVehiculo;

import AbstractFactory.AbstractFactory;
import EdficicacionRecurso.EdificacionRecurso;
import EdificacionMilicia.EdificacionMilicia;

/**
 *
 * @author Lucho
 */
public class VehiculoFactory implements AbstractFactory{

    @Override
    public EdificacionRecurso getEdificacionRecurso(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EdificacionMilicia getEdificacionMilicia(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EdificacionVehiculo getEdificacionVehiculo(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
