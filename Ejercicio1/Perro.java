/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class Perro {
    private String nomb; 
    private ArrayList<String> razaPerro;

    public Perro() {
    }

    public Perro(String nomb, ArrayList<String> razaPerro) {
        this.nomb = nomb;
        this.razaPerro = razaPerro;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public ArrayList<String> getRazaPerro() {
        return razaPerro;
    }

    public void setRazaPerro(ArrayList<String> razaPerro) {
        this.razaPerro = razaPerro;
    }

    @Override
    public String toString() {
        return "Perro{" + "nomb=" + nomb + ", razaPerro=" + razaPerro + '}';
    }


    
}
