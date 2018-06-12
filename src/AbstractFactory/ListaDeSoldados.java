/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import EdificacionMilicia.EdificacionMilicia;
import EdificacionMilicia.Soldado;
import java.util.ArrayList;

/**
 *
 * @author Lucho
 */
public class ListaDeSoldados {
        private ArrayList<Soldado> Lista_Soldado;
        private ArrayList<Soldado> Lista_Soldado2;
        
    //Constructor Inicializado
    public ListaDeSoldados() {
        Lista_Soldado = new ArrayList<>();
    }
    
    public void  AgregarSoldadoJug1(String tipo) {
        AbstractFactory raza;
        raza = FactoryDeEdificaciones.getAbstractFactory("milicia");
        EdificacionMilicia soldado1 = raza.getEdificacionMilicia(tipo);
        Lista_Soldado.add((Soldado) soldado1);
        
    }
    public void  AgregarSoldadoJug2(String tipo) {
        AbstractFactory raza;
        raza = FactoryDeEdificaciones.getAbstractFactory("milicia");
        EdificacionMilicia soldado1 = raza.getEdificacionMilicia(tipo);
        Lista_Soldado.add((Soldado) soldado1);
        
    }
    
        public void Mostrar_Soldado() {
        for (Soldado e : Lista_Soldado) {
            System.out.println(e.toString());

        }
    }
    
}
