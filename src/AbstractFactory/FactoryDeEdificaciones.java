/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import EdficicacionRecurso.RecursoFactory;
import EdificacionMilicia.MiliciaFactory;
import EdificacionVehiculo.VehiculoFactory;


/**
 *
 * @author Lucho
 */
public class FactoryDeEdificaciones {
            public static AbstractFactory getAbstractFactory(String type){
        switch (type){
           case "milicia":
                return (AbstractFactory) new MiliciaFactory();
            case "recurso":
                return  (AbstractFactory) new RecursoFactory();
            case "vehiculo":
                return  (AbstractFactory) new VehiculoFactory();
        }
       
        return null;
    }
}
