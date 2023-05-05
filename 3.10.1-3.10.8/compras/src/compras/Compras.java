/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compras;
//se importa la biblioteca para editar las variables
import java.util.Scanner;
/**
 *
 * @author Ambiente 209-1
 */
public class Compras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //se usa junto al import 
        Scanner scan = new Scanner(System.in);
        // se le dan valores numericos o caracteristicas a las variables
        int precio, num, total,total2 = 0 ;
        String r;
        do {
            System.out.print("Precio: $");
            precio = scan.nextInt();
            System.out.print("¿Cuantos de este articulo lleva?: ");
            num = scan.nextInt();
            total = precio * num;
            System.out.println("Pagar por este/os articulo/s: $"+total);
            System.out.print("¿Lista para pagar? ");
            r=scan.next();
            //Se va acumulando la suma del total, siempre y cuando el do.. while no se termine
            total2=total2+total;
        } while ("no".equals(r));
        System.out.println("Total a pagar: $"+total2);
    }
    
}
