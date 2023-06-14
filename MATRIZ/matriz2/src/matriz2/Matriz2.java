/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz2;

import java.util.Scanner;

/**
 *
 * @author Stork
 */
public class Matriz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int mayor = matriz[0][0], fila = 0, colum = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserte los números para la matriz:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = scan.nextInt();
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    fila = i;
                    colum = j;
                }
            }
        }
        System.out.println("El numero " + mayor + " se encuentra en la posicion: [" + fila + ", " + colum + "]");

    }

}
