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
public class Alienigenas {
    private String nombre;
    private Raza r;
    private int edad;
    private boolean amenaza;

    public Alienigenas() {
    }

    public Alienigenas(String nombre, Raza r, int edad, boolean amenaza) {
        this.nombre = nombre;
        this.r = r;
        this.edad = edad;
        this.amenaza = amenaza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getR() {
        return r;
    }

    public void setR(Raza r) {
        this.r = r;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isAmenaza() {
        return amenaza;
    }

    public void setAmenaza(boolean amenaza) {
        this.amenaza = amenaza;
    }

    @Override
    public String toString() {
        return "Alienigenas{" + "nombre=" + nombre + ", r=" + r + ", edad=" + edad + ", amenaza=" + amenaza + '}';
    }
    
}
