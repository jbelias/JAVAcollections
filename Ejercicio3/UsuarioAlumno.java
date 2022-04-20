/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class UsuarioAlumno {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Alumno> alumnos;
    
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public UsuarioAlumno() {
        this.alumnos = new ArrayList<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void CrearAlumno() {
        ArrayList<Integer> notas = new ArrayList<>();

        System.out.println("Ingrese el nombre del alumno: ");
        String a = leer.next();
        
        System.out.println("Cargue notas: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota " + (i+1) );
            notas.add(leer.nextInt());
        }
        
        alumnos.add(new Alumno(a, notas)); 
    }
    
    public void Imprimir() {
        alumnos.forEach((Alumno) -> {
            System.out.println(Alumno.toString());
        });
    }
    
    public float notaFinal(ArrayList<Integer> notas) { // pepe 1 2 10
        int suma = 0;
        for (Integer nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }
    
    
}
