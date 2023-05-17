/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primos;

/**
 *
 * @author SENA
 */
public class Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 30; // El valor de n que deseas utilizar
int[] numeros = new int[n];

// Almacenar los números del 1 al n en el vector
for (int i = 1; i <= n; i++) {
    numeros[i-1] = i;
}

// Imprimir los números primos
System.out.println("Numeros primos:");
for (int i = 0; i < n; i++) {
    if (esPrimo(numeros[i])) {
        System.out.println(numeros[i]);
    }
}
    }
// Función para determinar si un número es primo o no
    public static boolean esPrimo(int numero) {
    if (numero <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(numero); i++) {
        if (numero % i == 0) {
            return false;
        }
    }
    return true;
}
    }
    

