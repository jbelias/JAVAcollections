/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseMain;

import Ejercicio4.Pelicula;
import Ejercicio4.UsuarioPelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        UsuarioPelicula up = new UsuarioPelicula();
        ArrayList <Pelicula> peliculas = new ArrayList();

        int rta;

        do {
            up.CrearPelicula();
            System.out.println("¿Desea ingresar otra película? (Si = 1 / No = 2)");
            rta = leer.nextInt();
        } while (rta != 2);

        up.Imprimir();
        up.ImprimirMayor1Hora();
        up.PeliculasDeMayorAMenor();
        up.PeliculasDeMenorAMayor();
        up.PeliculasPorTitulo();
        up.PeliculasPorDirector();
    }

}
