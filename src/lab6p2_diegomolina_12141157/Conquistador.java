/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_diegomolina_12141157;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Conquistador extends Alienigenas {
    private ArrayList<Planeta> pConquistados = new ArrayList();

    public Conquistador() {
        super();
    }

    public Conquistador(String nombre, Raza r, int edad, boolean amenaza) {
        super(nombre, r, edad, amenaza);
    }

    public ArrayList<Planeta> getpConquistados() {
        return pConquistados;
    }

    public void setpConquistados(ArrayList<Planeta> pConquistados) {
        this.pConquistados = pConquistados;
    }

    @Override
    public String toString() {
        return "Conquistador{" + "pConquistados=" + pConquistados + '}';
    }
    
    
}
