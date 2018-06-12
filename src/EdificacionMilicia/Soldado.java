/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionMilicia;

/**
 *
 * @author Lucho
 */
public class Soldado implements EdificacionMilicia {
    private final String raza;
    private final int ataque;
    private final int defensa;
    private final int cantfase;

    public Soldado(SoldadoBuilder builder) {
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
   
    
    

   

    
    


    @Override
    public void speak() {
        System.out.println("Soy un soldado");
    }

    @Override
    public int ataque(int ataque) {
        
        return 0;
    }
   
    public static class SoldadoBuilder{
            private final String raza;
            private final int ataque;
            private final int defensa;
            private final int cantfase;

        public SoldadoBuilder(String raza, int ataque, int defensa, int cantfase) {
            this.raza = raza;
            this.ataque = ataque;
            this.defensa = defensa;
            this.cantfase = cantfase;
        }
        
        public Soldado build(){
            return new Soldado(this);
        }
            
        

}

    @Override
    public String toString() {
        return "Soldado{" + "raza=" + raza + ", ataque=" + ataque + ", defensa=" + defensa + ", cantfase=" + cantfase + '}';
    }
   
}
