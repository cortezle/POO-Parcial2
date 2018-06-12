/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdficicacionRecurso;

import AbstractFactory.AbstractFactory;
import EdificacionMilicia.EdificacionMilicia;
import EdificacionVehiculo.EdificacionVehiculo;

/**
 *
 * @author Lucho
 */
public class RecursoFactory implements AbstractFactory{

    @Override
    public EdificacionRecurso getEdificacionRecurso(String tipo) {
        switch (tipo) {
            case "generador3":
                return new GeneradorDeRecurso3();
            case "recolector1":
                return new RecolectorDeRecursos1.RecolectorDeRecursos1Builder("Dothraki", 0, 0, 0).build();
            case "recolector2":
                return new RecolectorDeRecursos2();
        }
        return null;
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
