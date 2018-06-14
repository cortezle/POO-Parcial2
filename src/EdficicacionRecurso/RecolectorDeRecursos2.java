/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdficicacionRecurso;

/**
 *
 * @author Lucho
 */
public class RecolectorDeRecursos2 implements EdificacionRecurso  {
        private final String raza;
    private final int vida;
    private final int cantfase;
    private final int recurso2;

    public RecolectorDeRecursos2(RecolectorDeRecursos2Builder builder) {
        this.raza = builder.raza;
        this.vida = builder.vida;
        this.cantfase = builder.cantfase;
        this.recurso2 = builder.recurso2;
    }
    
    

    public String getRaza() {
        return raza;
    }

    public int getRecurso2() {
        return recurso2;
    }
    


    public int getVida() {
        return vida;
    }

    public int getCantfase() {
        return cantfase;
    }
    
        public static class RecolectorDeRecursos2Builder{
            private final String raza;
            private final int vida;
            private final int cantfase;
            private final int recurso2;

        public RecolectorDeRecursos2Builder(String raza,int vida, int cantfase,int recurso2) {
            this.raza = raza;
            this.vida = vida;
            this.cantfase = cantfase;
            this.recurso2 = recurso2;
        }
        
        public RecolectorDeRecursos2 build(){
            return new RecolectorDeRecursos2(this);
        }
            }
            @Override
    public String toString() {
        return "Soldado{" + "raza=" + raza + ", recurso=" + recurso2 +  ", vida=" + vida + ", cantfase=" + cantfase + '}';
    }
    
}
