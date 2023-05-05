/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package granja;

import java.util.Scanner;

/**
 *
 * @author Ambiente 209-1
 */
public class Granja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variables
        int egg, n, num;
        float peso, alt, calidad, calfinal = 0, prom, precio;
        //promedio de la calidad de las gallinas
        System.out.println("¿Cuantas gallinas tienes?");
        num = scan.nextInt();
        do {
            System.out.print("Peso de la gallina: ");
            peso = scan.nextFloat();
            System.out.print("Altura de la gallina: ");
            alt = scan.nextFloat();
            System.out.print("Número de huevos que pone la gallina: ");
            egg = scan.nextInt();
            calidad = ((peso * alt) / egg);
            calfinal = calfinal + calidad;
            System.out.println("¿Cuantas gallinas van?");
            n = scan.nextInt();
        } while (n < num);
        prom = calfinal / n;
        System.out.println("Promedio de la(s) gallina(s) " + prom);

        //precio del kilo de huevo
        if (calfinal < 8) {
            precio = (int) ((float) 0.80 * prom);
            System.out.println("Precio por kilo: $" + precio);
        } else {
            if (calfinal > 8 && calfinal < 15) {
                precio = (int) ((float) 1.00 * prom);
                System.out.println("Precio por kilo: $" + precio);
            } else {
                if (calfinal >= 15) {
                    precio = (int) ((float) 1.2 * prom);
                    System.out.println("Precio por kilo: $" + precio);
                }
            }
        }
    }

}
