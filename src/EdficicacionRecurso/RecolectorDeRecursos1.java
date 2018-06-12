/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdficicacionRecurso;

import EdificacionMilicia.Soldado;

/**
 *
 * @author Lucho
 */
public class RecolectorDeRecursos1 implements EdificacionRecurso {
    private final String raza;
    private final int ataque;
    private final int defensa;
    private final int cantfase;

    public RecolectorDeRecursos1(RecolectorDeRecursos1Builder builder) {
        this.raza = builder.raza;
        this.ataque = builder.ataque;
        this.defensa = builder.defensa;
        this.cantfase = builder.cantfase;
    }
    
    

    public String getRaza() {
        return raza;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getCantfase() {
        return cantfase;
    }
    
        public static class RecolectorDeRecursos1Builder{
            private final String raza;
            private final int ataque;
            private final int defensa;
            private final int cantfase;

        public RecolectorDeRecursos1Builder(String raza, int ataque, int defensa, int cantfase) {
            this.raza = raza;
            this.ataque = ataque;
            this.defensa = defensa;
            this.cantfase = cantfase;
        }
        
        public RecolectorDeRecursos1 build(){
            return new RecolectorDeRecursos1(this);
        }
            
        

}
    
}
