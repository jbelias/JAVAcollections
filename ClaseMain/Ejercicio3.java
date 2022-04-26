/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseMain;

import Ejercicio3.Alumno;
import Ejercicio3.UsuarioAlumno;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        UsuarioAlumno ua = new UsuarioAlumno();

        System.out.println("¿Cuantos alumnos desea ingresar?: ");
        int respuesta = leer.nextInt();

        for (int i = 0; i < respuesta; i++) {
            ua.CrearAlumno();
        }

        ua.Imprimir();
        System.out.println("Ingrese el nombre del alumno que desea calcular su promedio: ");
        String nom = leer.next();

        for (Alumno Alumno : ua.getAlumnos()) {
            if (Alumno.getNombre().equalsIgnoreCase(nom)) {
                System.out.println("El promedio de " + nom + " es de: " + ua.notaFinal(Alumno.getNota()));
            }
        }
    }

}
