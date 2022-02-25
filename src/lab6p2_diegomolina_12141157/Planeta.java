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
public class Planeta {
    private String nomPlaneta;
    private boolean hayAgua;
    private double tamano;
    private double temperatura;
    private ArrayList<Alienigenas> aliens = new ArrayList();

    public Planeta() {
    }

    public Planeta(String nomPlaneta, boolean hayAgua, double tamano, double temperatura) {
        this.nomPlaneta = nomPlaneta;
        this.hayAgua = hayAgua;
        this.tamano = tamano;
        this.temperatura = temperatura;
    }

    public String getNomPlaneta() {
        return nomPlaneta;
    }

    public void setNomPlaneta(String nomPlaneta) {
        this.nomPlaneta = nomPlaneta;
    }

    public boolean isHayAgua() {
        return hayAgua;
    }

    public void setHayAgua(boolean hayAgua) {
        this.hayAgua = hayAgua;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public ArrayList<Alienigenas> getAliens() {
        return aliens;
    }

    public void setAliens(ArrayList<Alienigenas> aliens) {
        this.aliens = aliens;
    }

    @Override
    public String toString() {
        return "Planeta{" + "nomPlaneta=" + nomPlaneta + ", hayAgua=" + hayAgua + ", tamano=" + tamano + ", temperatura=" + temperatura + ", aliens=" + aliens + '}';
    }
    
}
