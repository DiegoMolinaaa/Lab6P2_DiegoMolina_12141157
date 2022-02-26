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
public class Abduzcan extends Alienigenas{
    private int animalesAb;

    public Abduzcan() {
        super();
    }

    public Abduzcan(int animalesAb, String nombre, Raza r, int edad, boolean amenaza) {
        super(nombre, r, edad, amenaza);
        this.animalesAb = animalesAb;
    }

    public int getAnimalesAb() {
        return animalesAb;
    }

    public void setAnimalesAb(int animalesAb) {
        this.animalesAb = animalesAb;
    }

    @Override
    public String toString() {
        //return "Abduzcan{"+super.toString() + "animalesAb=" + animalesAb + '}';
        return super.getNombre();
    }
    
    
}
