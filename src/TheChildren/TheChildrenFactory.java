/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheChildren;

import Dothraki.Dothraki;
import Dothraki.EdificacionDothraki.EdificacionDeMilicia;
import Dothraki.EdificacionDothraki.EdificacionDeRecurso;
import Dothraki.EdificacionDothraki.EdificacionDeVehiculos;

/**
 *
 * @author Lucho
 */
public class TheChildrenFactory {
     public Dothraki getDothraki(String tipo) {
        switch (tipo) {
            case "suma":
                return new EdificacionDeMilicia();
            case "resta":
                return new EdificacionDeRecurso();
            case "multiplicacion":
                return new EdificacionDeVehiculos();


        }
        return null;
    }
}
