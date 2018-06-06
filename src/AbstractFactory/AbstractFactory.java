/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import Dothraki.Dothraki;
import NightsWatch.NightsWatch;
import TheChildren.TheChildren;

/**
 *
 * @author Lucho
 */
public interface AbstractFactory {
    Dothraki getDothraki();
    NightsWatch getNightsWatch();
    TheChildren getTheChildren();
}
