/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionMilicia;

import AbstractFactory.AbstractFactory;
import EdficicacionRecurso.EdificacionRecurso;
import EdificacionVehiculo.EdificacionVehiculo;

/**
 *
 * @author Lucho
 */
public class MiliciaFactory implements AbstractFactory {

    @Override
    public EdificacionMilicia getEdificacionMilicia(String tipo) {
        switch (tipo) {
            case "soldado":
                return new Soldado.SoldadoBuilder("Dothraki",12,12,12).build();

        }
        return null;
    }

    @Override
    public EdificacionRecurso getEdificacionRecurso(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    @Override
    public EdificacionVehiculo getEdificacionVehiculo(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
