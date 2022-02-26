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
public class Explorador extends Alienigenas{
    private ArrayList<Planeta> pExplorados = new ArrayList();
    private Planeta planetaFav;

    public Explorador() {
        super();
    }

    public Explorador(Planeta planetaFav, String nombre, Raza r, int edad, boolean amenaza) {
        super(nombre, r, edad, amenaza);
        this.planetaFav = planetaFav;
    }

    public ArrayList<Planeta> getpExplorados() {
        return pExplorados;
    }

    public void setpExplorados(ArrayList<Planeta> pExplorados) {
        this.pExplorados = pExplorados;
    }

    public Planeta getPlanetaFav() {
        return planetaFav;
    }

    public void setPlanetaFav(Planeta planetaFav) {
        this.planetaFav = planetaFav;
    }

    @Override
    public String toString() {
        //return "Explorador{"+super.toString() + "pExplorados=" + pExplorados + ", planetaFav=" + planetaFav + '}';
        return super.getNombre();
    }
    
}
