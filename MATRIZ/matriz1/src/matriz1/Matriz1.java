/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz1;

import java.util.Scanner;

/**
 *
 * @author Stork
 */
public class Matriz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[2][3];
        int suma = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserte los números para la matriz:");
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[j] = scan.nextInt();
                suma += matriz1[j];
            }
        }
        System.out.println("La suma de los números de la matriz da: " + suma);
    }

}
