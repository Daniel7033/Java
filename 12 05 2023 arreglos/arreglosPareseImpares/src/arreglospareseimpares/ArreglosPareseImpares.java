/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglospareseimpares;

/**
 *
 * @author SENA
 */
public class ArreglosPareseImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 20; // El valor de n que deseas utilizar
        int[] numeros = new int[n];

        // Almacenar los números del 1 al n en el vector
        for (int i = 1; i <= n; i++) {
            numeros[i-1] = i;
        }

        // Imprimir los números pares
        System.out.println("Numeros pares:");
        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }

        // Imprimir los números impares
        System.out.println("Numeros impares:");
        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println(numeros[i]);
            }
        }
    }
    
}
