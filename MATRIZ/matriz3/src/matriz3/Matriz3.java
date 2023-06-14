/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Stork
 */
public class Matriz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        //VECTORES
        int[] fila = new int[matriz.length];
        int[] colum = new int[matriz[0].length];

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserte los números para la matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scan.nextInt();
            }
        }
        //FILAS
        for (int i = 0; i < matriz.length; i++) {
            int sumaf = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaf += matriz[i][j];
            }
            fila[i] = sumaf;
        }
        //COLUMNAS
        for (int j = 0; j < matriz[0].length; j++) {
            int sumac = 0;
            for (int[] matriz1 : matriz) {
                sumac += matriz1[j];
            }
            colum[j] = sumac;
        }
        
        System.out.println("Suma de los renglones: ");    
        for (int suma : fila) {
        System.out.println(suma);    
        }
        
        System.out.println("Suma de los columnas: ");
        for (int suma : colum) {
        System.out.println(suma);
        }
        
    }

}
