/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosn2;

/**
 *
 * @author SENA
 */
public class ArreglosN2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 50; // El valor de n que deseas utilizar
        int[] numeros = new int[n];
        for (int i = 1; i <= n; i++) {
            numeros[i-1] = i;
        }
         for (int i = 1; i <= n; i++) {
            System.out.println(numeros[i-1]);
        }
    }
    
}
