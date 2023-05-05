/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package impar;

import java.util.Scanner;

/**
 *
 * @author Stork
 */
public class Impar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // TODO code application logic here
        int num1, num2, mcd = 1, mcm;
        System.out.println("Ingresa el primer número: ");
        num1 = scan.nextInt();
        System.out.println("Ingresa el segundo número: ");
        num2 = scan.nextInt();
        if (num2 % 2 != 0) { //!= es el diferente ("!=" = "<>")
            mcd = 1;
            for (int i = 1; i <= num1 && i <= num2; i++) {
              if (num1 % i == 0 && num2 % i == 0) {
                    mcd = i;
              }
            }
            mcm = (num1 * num2) / mcd;
            System.out.println("El maximo comun divisor de " + num1 + " y " + num2 + " es " + mcm);
        } else {
            System.out.println("El segundo número no es impar. No se mostrará el MCM");
        }
    }
    
}
