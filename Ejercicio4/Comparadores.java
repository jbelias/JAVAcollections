/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.Comparator;

/**
 *
 * @author Juan
 */
public class Comparadores {

    public static Comparator<Pelicula> ordenarDeMayoraMenor = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getDuracion().compareTo(o1.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ordenarDeMenoraMayor = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDuracion().compareTo(o2.getDuracion());
        }
    };

    public static Comparator<Pelicula> ordenarPorTitulo = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getTitulo().compareTo(o1.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorDirector = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getDirector().compareTo(o1.getDirector());
        }
    };
}
