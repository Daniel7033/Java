/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teatro;

import java.util.Scanner;

/**
 *
 * @author Ambiente 209-1
 */
public class Teatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  pagar = 0, edad, perdida = 0, perdida2 = 0, precio;
        System.out.print("Valor de la entrada el día de hoy: $");
        precio = scan.nextInt();
        String r;
        do {
            System.out.println("Bienveido al Teatro");
            System.out.println("Edad actual: ");
            edad = scan.nextInt();
            if (edad < 5) {
                System.out.println("Lo sentimos, pero los niños menores de 5 años, no pueden entrar");
            } else if (edad >= 5 && edad <= 14) {
                System.out.println("Categoria 1: Descuento 35%");
                 pagar = precio - ((precio / 100) * 35);
            } else if (edad >= 15 && edad <= 19) {
                System.out.println("Categoria 2: Descuento 25%");
                 pagar = (precio - ((precio / 100) * 25));
            } else if (edad >= 20 && edad <= 45) {
                System.out.println("Categoria 3: Descuento 10%");
                 pagar = precio - ((precio / 100) * 10);
            } else if (edad >= 46 && edad <= 65) {
                System.out.println("Categoria 4: Descuento 25%");
                 pagar = precio - ((precio / 100) * 25);
            } else if (edad >= 66) {
                System.out.println("Categoria 5: Descuento 35%");
                 pagar = precio - ((precio / 100) * 35);
            }
            System.out.println("Pagar: $" + pagar);
            System.out.println("¿Hay más clientes? (si/no)");
            r = scan.next();
            perdida = ( precio -  pagar);
            perdida2 =  (perdida2 + perdida);
        } while ("si".equals(r));
        System.out.println("Perdidas por descuento:" + perdida2);

    }

}
