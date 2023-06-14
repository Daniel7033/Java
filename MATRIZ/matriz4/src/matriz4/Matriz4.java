/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz4;

import java.util.Scanner;

/**
 *
 * @author Stork
 */
public class Matriz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        //VECTOR
        int[] colum = new int[matriz[0].length];

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserte los números para la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = scan.nextInt();
            }
        }
        //COLUMNAS
        for (int j = 0; j < matriz[0].length; j++) {
            int sumac = 0;
            for (int[] matriz1 : matriz) {
                sumac += matriz1[j];
            }
            colum[j] = sumac;
        }
        
        int mayor = 0;
        for (int suma : colum) {
            if (suma > mayor) {
                mayor = suma;
            }
        }
        System.out.println("Numero de la suma de la columna es: " + mayor);
    }

}
