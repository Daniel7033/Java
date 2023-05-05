/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclicas.repetir.hasta;

import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class CiclicasRepetirHasta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total, t2, t3;
        String resp;
        do {
            System.out.println("¿Desea pagar ya?");
            resp = scan.next();
            if ("si".equals(resp)) {
                System.out.print("Pagar: $");
                total = scan.nextInt();
                System.out.println("Saque de está caja una bolita de colores");
                int ram = (int)(Math.random()*3+1);
                switch (ram) {
                    case 1:
                        System.out.println("Bolita color ROJO");
                        t2 = (int) (total*0.4);
                        t3 = total - t2;
                        System.out.println("Obtuvo un descuento del 40%. Pagando ahora $"+t3);
                        break;
                    case 2:
                        System.out.println("Bolita color Amarillo");
                        t2 = (int) (total*0.25);
                        t3 = total - t2;
                        System.out.println("Obtuvo un descuento del 25%. Pagando ahora $"+t3);
                        break;
                    case 3:
                        System.out.println("Bolita color BLANCO");
                        System.out.println("Lo sentimos, este color no trae ningún descuento, su total a pagar es $"+total);  
                        break;
                }
            }
        } while ("no".equals(resp));
        
    }

}
