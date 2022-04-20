/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseMain;

import Ejercicio1.Perro;
import Ejercicio1.UsuarioPerro;

/**
 *
 * @author Juan
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UsuarioPerro up = new UsuarioPerro();
        
        up.crearPerro();
        up.Imprimir();
        up.Eliminar();
    }
}
