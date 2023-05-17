/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos100;

/**
 *
 * @author SENA
 */
public class Arreglos100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = new int[100];
        for (int i = 1; i <= 100; i++) {
            numeros[i-1] = i;
        }
       
    }
    
}
