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
        
            case "dothraki":
                return new RecolectorDeRecursos1.RecolectorDeRecursos1Builder("grass",32,53,3).build();
            case "dothraki2":
                return new RecolectorDeRecursos1.RecolectorDeRecursos1Builder("plata",32,53,3).build();
            case "nightswatch":
                return new RecolectorDeRecursos1.RecolectorDeRecursos1Builder("oro",32,53,3).build();
            case "nightswatch2":
                return new RecolectorDeRecursos1.RecolectorDeRecursos1Builder("Hierro",32,53,3).build();
            case "thechildren":
                return new RecolectorDeRecursos1.RecolectorDeRecursos1Builder("dragonglass",32,53,3).build();
            case "thechildren2":
                return new RecolectorDeRecursos1.RecolectorDeRecursos1Builder("Elixir de Dragon",32,53,3).build();

        
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
