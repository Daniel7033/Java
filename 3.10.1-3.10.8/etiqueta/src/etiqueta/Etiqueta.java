/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template

Una persona que va de compras a la tienda “Enano, S.A.”, decide llevar un control
sobre lo que va comprando, para saber la cantidad de dinero que tendrá que pagar
al llegar a la caja. La tienda tiene una promoción del 20% de descuento sobre
aquellos artículos cuya etiqueta sea roja. Determinar la cantidad de dinero que
esta persona deberá pagar.
 */
package etiqueta;

import java.util.Scanner;

/**
 *
 * @author Stork
 */
public class Etiqueta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variables
        int precio, total, total2 = 0;
        String r, r2;
        System.out.println("Bienvenido a la tienda Enano, S. A");
        do {
            System.out.print("Precio del articulo: $");
            precio = scan.nextInt();
            System.out.print("¿Lleva etiqueta roja? (si/no): ");
            r = scan.next();
            if ("si".equals(r)) {
                //Multipplico el porcentaje que quiero averiguar por el "precio" y el resultado lo divido por 100 sacando el 20% del 100%
                total = (20 * precio) / 100;
                total = precio - total;
            } else {
                total = precio;
            }
            System.out.print("¿List@ para pagar? (si/no):");
            r2 = scan.next();
            //Se va acumulando la suma del total, siempre y cuando el do.. while no se termine
            total2 = total2 + total;
        } while ("no".equals(r2));
        System.out.println("Total pagar: $" + total2);
    }

}
