/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import EdficicacionRecurso.EdificacionRecurso;
import EdificacionMilicia.EdificacionMilicia;
import EdificacionVehiculo.EdificacionVehiculo;



/**
 *
 * @author Lucho
 */
public interface AbstractFactory {
    EdificacionRecurso getEdificacionRecurso(String type);
    EdificacionMilicia getEdificacionMilicia(String type);
    EdificacionVehiculo getEdificacionVehiculo(String type);
}
