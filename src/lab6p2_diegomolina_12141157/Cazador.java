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
public class Cazador extends Alienigenas {
    private int humAtrapados;

    public Cazador() {
        super();
    }

    public Cazador(int humAtrapados, String nombre, Raza r, int edad, boolean amenaza) {
        super(nombre, r, edad, amenaza);
        this.humAtrapados = humAtrapados;
    }

    public int getHumAtrapados() {
        return humAtrapados;
    }

    public void setHumAtrapados(int humAtrapados) {
        this.humAtrapados = humAtrapados;
    }

    @Override
    public String toString() {
        //return "Cazador{"+super.toString() + "humAtrapados=" + humAtrapados + '}';
        return super.getNombre();
    }
    
    
}
