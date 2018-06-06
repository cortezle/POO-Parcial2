/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dothraki;

import Dothraki.EdificacionDothraki.EdificacionDeVehiculos;
import Dothraki.EdificacionDothraki.EdificacionDeRecurso;
import Dothraki.EdificacionDothraki.EdificacionDeMilicia;
import AbstractFactory.AbstractFactory;
import NightsWatch.NightsWatch;
import TheChildren.TheChildren;

/**
 *
 * @author Lucho
 */
public class DothrakiFactory implements AbstractFactory {
    
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

    @Override
    public Dothraki getDothraki() {
return null;
    }

    @Override
    public NightsWatch getNightsWatch() {
return null;    }

    @Override
    public TheChildren getTheChildren() {
return null;    }
}
