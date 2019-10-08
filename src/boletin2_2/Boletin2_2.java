/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_2;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Boletin2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tm= new Scanner(System.in);
        System.out.print("Teclea temperatura en grados: ");
        double grados = tm.nextDouble();
        System.out.println("O resultado en fahrenheit: "+(grados * 9 / 5 + 32)+" ºF");
        System.out.println("O resultado en kelvin: "+(grados - 273.15)+" K");
    }
    
}
