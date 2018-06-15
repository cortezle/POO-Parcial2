/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luiscortez.sworld;

/**
 *
 * @author Lucho
 */
public class Jugador {
    private String user;
    private String raza;

    public Jugador() {
    }

    public Jugador(String user, String raza) {
        this.user = user;
        this.raza = raza;
    }

    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
}
