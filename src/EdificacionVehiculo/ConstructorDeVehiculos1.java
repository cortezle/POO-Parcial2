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
    
    private int id_vh;
    private int ataque;
    private int defensa;
    private String raza;
    private int cantfase;

    public ConstructorDeVehiculos1(ConstructorDeVehiculos1Builder builder) {
        this.ataque = builder.ataque;
        this.defensa = builder.defensa;
        this.raza = builder.raza;
        this.cantfase = builder.cantfase;
        this.id_vh = builder.id_vh;
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

    public int getId_vh() {
        return id_vh;
    }
    
    
    
        public static class ConstructorDeVehiculos1Builder{
            private final String raza;
            private final int ataque;
            private final int defensa;
            private final int cantfase;
            private final int id_vh;

        public ConstructorDeVehiculos1Builder(String raza, int ataque, int defensa, int cantfase, int id_vh) {
            this.raza = raza;
            this.ataque = ataque;
            this.defensa = defensa;
            this.cantfase = cantfase;
            this.id_vh= id_vh;
        }
        
        public ConstructorDeVehiculos1 build(){
            return new ConstructorDeVehiculos1(this);
        }
        
           }
            
         @Override
    public String toString() {
        return "Vehiculo{" + "id= " + this.id_vh +  ", raza=" + raza +", ataque=" + ataque + ", defensa=" + defensa + ", cantfase=" + cantfase + '}';
    }
    
}
