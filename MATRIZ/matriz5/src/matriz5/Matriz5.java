/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz5;

import java.util.Scanner;

/**
 *
 * @author Stork
 */
public class Matriz5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Inserte los números para la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = scan.nextInt();
            }
        }
        //VECTOR DIAGONAL
        int[] dia = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            dia[i] = matriz[i][i];
        }
        for (int num : dia) {
            System.out.println(num);
        }
    }

}
