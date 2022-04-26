/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Juan
 */
public class UsuarioPais {

    private TreeSet<Pais> nuevoMapa;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void PaisServicioHashSet() {
        this.nuevoMapa = new TreeSet<>(); // Creo el espacio en memoria del LISTAS
        this.leer = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
    }

    public void CargarPais() {
        String nombre;
        int rta;

        do {
            System.out.println("Ingrese el pais: ");
            nombre = leer.next();
            System.out.println("¿Desea ingresar otro País? (Si = 1 / No = 2)");
            rta = leer.nextInt();
        } while (rta != 2);

        nuevoMapa.add(new Pais(nombre));
    }

}
