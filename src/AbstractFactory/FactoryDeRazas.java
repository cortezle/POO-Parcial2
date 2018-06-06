/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import Dothraki.DothrakiFactory;
import NightsWatch.NightsWatch;
import TheChildren.TheChildrenFactory;

/**
 *
 * @author Lucho
 */
public class FactoryDeRazas {
            public static AbstractFactory getAbstractFactory(String type){
        switch (type){
           case "dothraki":
                return (AbstractFactory) new DothrakiFactory();
            case "nightswatch":
                return  (AbstractFactory) new NightsWatch();
            case "the children":
                return  (AbstractFactory) new TheChildrenFactory();
        }
       
        return null;
    }
}
