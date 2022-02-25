/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_diegomolina_12141157;

/**
 *
 * @author diego
 */
public class Raza {
    private Planeta pPrimordial;
    private String nombreRaza;

    public Raza() {
    }

    public Raza(Planeta pPrimordial, String nombreRaza) {
        this.pPrimordial = pPrimordial;
        this.nombreRaza = nombreRaza;
    }

    public Planeta getpPrimordial() {
        return pPrimordial;
    }

    public void setpPrimordial(Planeta pPrimordial) {
        this.pPrimordial = pPrimordial;
    }

    public String getNombreRaza() {
        return nombreRaza;
    }

    public void setNombreRaza(String nombreRaza) {
        this.nombreRaza = nombreRaza;
    }

    @Override
    public String toString() {
        return nombreRaza;
    }
    
}
