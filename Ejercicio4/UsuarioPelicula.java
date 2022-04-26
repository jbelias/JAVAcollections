/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class UsuarioPelicula {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Pelicula> peliculas;

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public UsuarioPelicula() {
        this.peliculas = new ArrayList<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void CrearPelicula() {

        System.out.println("Ingrese el nombre de la película: ");
        String peli = leer.next();

        System.out.println("Ingrese el nombre del director: ");
        String direc = leer.next();

        System.out.println("Ingrese la duracion de la pelicula en horas(Ej 1,5): ");
        Double time = leer.nextDouble();

        peliculas.add(new Pelicula(peli, direc, time));
    }

    public void Imprimir() {
        System.out.println("A continuación, todas las películas ingresadas: ");
        peliculas.forEach((Pelicula) -> {
            System.out.println(Pelicula.toString());
        });
    }

    public void ImprimirMayor1Hora() {
        System.out.println("A continuación, todas las películas que duran más de 1 hr: ");

        for (Pelicula aux : peliculas) {
            if (aux.getDuracion() > 1.0) {
                System.out.println(aux.getTitulo());
            }
        }
    }

    public void PeliculasDeMayorAMenor() {
        System.out.println("Las peliculas ordenadas de mayor a menor quedarían de la siguiente manera:");
        
        Collections.sort(peliculas, Comparadores.ordenarDeMayoraMenor);
        
        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }
    }
    
    public void PeliculasDeMenorAMayor() {
        System.out.println("Las peliculas ordenadas de menor a mayor quedarían de la siguiente manera:");
        
        Collections.sort(peliculas, Comparadores.ordenarDeMenoraMayor);
        
        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }
    }
    
    public void PeliculasPorTitulo() {
        System.out.println("Las peliculas ordenadas por título quedarían de la siguiente manera:");
        
        Collections.sort(peliculas, Comparadores.ordenarPorTitulo);
        
        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }
    }
    
    public void PeliculasPorDirector() {
        System.out.println("Las peliculas ordenadas por director quedarían de la siguiente manera:");
        
        Collections.sort(peliculas, Comparadores.ordenarPorDirector);
        
        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }
    }
    }
