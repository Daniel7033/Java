/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jovenes;

/**
 *
 * @author SENA
 */
import java.util.Scanner;

public class Jovenes {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int contador = 0;
      
      for (int i = 1; i <= 1000; i++) {
         System.out.print("Ingrese el número de censo: ");
         int numCenso = sc.nextInt();
         System.out.print("Ingrese el sexo (M/F): ");
         char sexo = sc.next().charAt(0);
         System.out.print("Ingrese la edad: ");
         int edad = sc.nextInt();
         System.out.print("Ingrese el estado civil (a.- soltero, b. Casado, c. Viudo, d. Divorciado): ");
         char estadoCivil = sc.next().charAt(0);
         
         if (sexo == 'F' && estadoCivil == 'a' && edad >= 16 && edad <= 21) {
            System.out.println("Número de censo de la joven soltera: " + numCenso);
            contador++;
         }
      }
      
      System.out.println("Total de jóvenes solteras entre 16 y 21 años: " + contador);
   }
}