/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horas;

import java.util.Scanner;

/**
 *
 * @author Ambiente 209-1
 */
public class Horas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valorh, horas, hextras = 0, pagar = 0;
        String resp;
        do {
            System.out.println("Valor por hora:");
            valorh = scan.nextInt();
            System.out.println("Horas laboradas a la semana:");
            horas = scan.nextInt();
            if (horas > 40) {
                hextras = horas - 40;
                horas = horas - hextras;
                if (hextras > 8) {
                    horas = 8 - hextras;
                    hextras = horas - hextras;
                    pagar = hextras * (valorh * 3);
                }
            } else {
                if (hextras <= 8) {
                    pagar = hextras * (valorh * 2);
                }
            }
        System.out.println("Se le pagará $" + pagar + " por sus horas extras");
        System.out.println("¿Dejar de preguntar?");
        resp = scan.next();
    }

    while ("no".equals(resp)

);
    }

}
