/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package base;

import java.util.Scanner;
/**
 *
 * @author Stork
 */
public class Base {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // TODO code application logic here
        int base, expo, rest = 1;
        System.out.println("Número base ");
        base = scan.nextInt();
        System.out.println("Número del exponente ");
        expo = scan.nextInt();
        for (int i = 0; i < expo; i++) {
            rest *= base;
        }
        System.out.println("el resultado de "+base+" elevado a la "+expo+" es "+ rest);
    }
    
}
