/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionVehiculo;

import EdficicacionRecurso.EdificacionRecurso;
import EdificacionMilicia.Soldado;

/**
 *
 * @author Lucho
 */
public class ConstructorDeVehiculos1 implements EdificacionVehiculo {
    
    private int ataque;
    private int defensa;
    private String raza;
    private int cantfase;

    public ConstructorDeVehiculos1(ConstructorDeVehiculos1Builder builder) {
        this.ataque = builder.ataque;
        this.defensa = builder.defensa;
        this.raza = builder.raza;
        this.cantfase = builder.cantfase;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public String getRaza() {
        return raza;
    }

    public int getcantfase() {
        return cantfase;
    }
    
        public static class ConstructorDeVehiculos1Builder{
            private final String raza;
            private final int ataque;
            private final int defensa;
            private final int cantfase;

        public ConstructorDeVehiculos1Builder(String raza, int ataque, int defensa, int cantfase) {
            this.raza = raza;
            this.ataque = ataque;
            this.defensa = defensa;
            this.cantfase = cantfase;
        }
        
        public ConstructorDeVehiculos1 build(){
            return new ConstructorDeVehiculos1(this);
        }
        
           }
            
         @Override
    public String toString() {
        return "Vehiculo{" + "raza=" + raza + ", ataque=" + ataque + ", defensa=" + defensa + ", cantfase=" + cantfase + '}';
    

}
    
}
