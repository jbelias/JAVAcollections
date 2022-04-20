/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class UsuarioPerro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Perro> perros;

    public UsuarioPerro() {
        this.perros = new ArrayList<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void crearPerro() {
        ArrayList<String> razaPerro = new ArrayList<>();
        int rta;

        do {
            System.out.println("Ingrese la raza de perro");
            String a = leer.next();
            razaPerro.add(a);
            
            System.out.println("Ingrese el nombre del perro:");
            String nombrePerro = leer.next();
            
            System.out.println(" ");
            System.out.println("¿Desea ingresar otro perro? (Si = 1 /No = 2)");
            rta = leer.nextInt();

            perros.add(new Perro(nombrePerro, razaPerro));
        } while (rta != 2);
    }

    public void Imprimir() {
        perros.forEach((perro) -> {
            System.out.println(perro.toString());
        });
    }

    public void Eliminar() {
        System.out.println("Ingrese un nombre que desee eliminar");
        String nombre = leer.next();
        
        for (int i = 0; i < perros.size(); i++) {
            Perro p = perros.get(i);

            if (p.getNomb().equals(nombre)) {
                perros.remove(i);
            }
        }

        perros.forEach((perro) -> {
            System.out.println(perro.toString());
        });
    }
}
