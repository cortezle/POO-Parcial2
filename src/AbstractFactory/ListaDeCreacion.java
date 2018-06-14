/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import EdficicacionRecurso.EdificacionRecurso;
import EdficicacionRecurso.RecolectorDeRecursos1;
import EdificacionMilicia.EdificacionMilicia;
import EdificacionMilicia.Soldado;
import EdificacionVehiculo.ConstructorDeVehiculos1;
import EdificacionVehiculo.EdificacionVehiculo;
import java.util.ArrayList;

/**
 *
 * @author Lucho
 */
public class ListaDeCreacion {
        private ArrayList<Soldado> Lista_Soldado;
        private ArrayList<Soldado> Lista_Soldado2;
        private ArrayList<ConstructorDeVehiculos1> Lista_Vehiculo;
        private ArrayList<RecolectorDeRecursos1> Lista_Recurso;
        private ArrayList<EdificacionMilicia> Lista_Milicia;

        AbstractFactory raza;
        
    //Constructor Inicializado
    public ListaDeCreacion() {
        Lista_Soldado = new ArrayList<>();
        Lista_Soldado2 = new ArrayList<>();
        Lista_Milicia = new ArrayList<>();
        Lista_Vehiculo = new ArrayList<>();
        Lista_Recurso = new ArrayList<>();
    }
    
    public void AgregarSoldadoJug1(String tipo) {
        raza = FactoryDeEdificaciones.getAbstractFactory("milicia");
        EdificacionMilicia soldado1 = raza.getEdificacionMilicia(tipo);
        Lista_Soldado.add((Soldado) soldado1);

    }
    public void AgregarVehiculoJug1(String tipo) {
                        raza = FactoryDeEdificaciones.getAbstractFactory("vehiculo");
                        EdificacionVehiculo veh1 = raza.getEdificacionVehiculo(tipo);
                        Lista_Vehiculo.add((ConstructorDeVehiculos1) veh1);
    }
    public void AgregarRecursoJug1(String tipo) {
                        raza = FactoryDeEdificaciones.getAbstractFactory("recurso");
                        EdificacionRecurso recurso = raza.getEdificacionRecurso(tipo);
                        Lista_Recurso.add((RecolectorDeRecursos1) recurso);
    }

    public void AgregarSoldadoJug2(String tipo) {
        EdificacionMilicia soldado1 = raza.getEdificacionMilicia(tipo);
        Lista_Soldado2.add((Soldado) soldado1);

    }

    public int AgregarEdMilicia() {
        
        System.out.println("Se creo la Edificacion de Milicia");
        return 4;
    }

        public void Mostrar_Soldado() {
        for (Soldado e : Lista_Soldado) {
            System.out.println(e.toString());

        }
    }
        public void Mostrar_Vehiculo() {
        for (ConstructorDeVehiculos1 e : Lista_Vehiculo) {
            System.out.println(e.toString());
        }
    }
        public void Mostrar_Recurso() {
        for (RecolectorDeRecursos1 e : Lista_Recurso) {
            System.out.println(e.toString());

        }
    }
    
        public int Obtener_Recurso() {
            int cont=0;
        for (RecolectorDeRecursos1 e : Lista_Recurso) {
            cont+=e.getRecurso1();

        }
    return cont;
        }
        public int Mostrar_EdMilicia() {
            int cont =0;
        for (EdificacionMilicia e : Lista_Milicia) {
            System.out.println(e.toString());
            cont++;
        }return cont;
    }
    
}
