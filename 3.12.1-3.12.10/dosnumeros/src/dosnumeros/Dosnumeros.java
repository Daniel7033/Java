/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dosnumeros;

import java.util.Scanner;

/**
 *
 * @author Stork
 */
public class Dosnumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, e, i;
        System.out.print("Número 1: ");
        a = scan.nextInt();
        System.out.print("Número 2: ");
        e = scan.nextInt();
        i = a + e;
        System.out.println("Producto de la suma: " + i);
    }
    
}
