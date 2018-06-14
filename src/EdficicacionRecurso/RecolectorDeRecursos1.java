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
    private final int recurso1;
    private final int cantfase;
    private final int vida;

    public RecolectorDeRecursos1(RecolectorDeRecursos1Builder builder) {
        this.raza = builder.raza;
        this.recurso1 = builder.recurso1;
        this.cantfase = builder.cantfase;
        this.vida= builder.vida;
    }
    
    

    public String getRaza() {
        return raza;
    }

    public int getVida() {
        return vida;
    }
    


    public int getRecurso1() {
        return recurso1;
    }

    public int getCantfase() {
        return cantfase;
    }
    
        public static class RecolectorDeRecursos1Builder{
            private final String raza;
            private final int recurso1;
            private final int cantfase;
            private final int vida;

        public RecolectorDeRecursos1Builder(String raza,int recurso1, int cantfase, int vida) {
            this.raza = raza;
            this.recurso1 = recurso1;
            this.cantfase = cantfase;
            this.vida = vida;
        }
        
        public RecolectorDeRecursos1 build(){
            return new RecolectorDeRecursos1(this);
        }
            }
            @Override
    public String toString() {
        return "Edificacion De Recurso{" + "raza=" + raza + ", recurso=" + recurso1 + ", vida=" + vida + ", cantfase=" + cantfase + '}';
    }
    
}
