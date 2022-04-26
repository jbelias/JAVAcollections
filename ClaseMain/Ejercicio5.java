/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseMain;

import Ejercicio5.UsuarioPais;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        UsuarioPais up = new UsuarioPais();

        up.CargarPais();
    }

}
