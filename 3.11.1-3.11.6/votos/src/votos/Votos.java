/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package votos;

import java.util.Scanner;

/**
 *
 * @author Stork
 */
public class Votos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int can1 = 0, final1 = 0, can2 = 0, final2 = 0, can3 = 0, final3 = 0, voto, votantes = 0, personas;

        System.out.println("Número de personas a votar: ");
        personas = scan.nextInt();
        
        while (votantes < personas) {
            votantes++;
            if (votantes <= 5) {
                System.out.println("Vota por:");
                System.out.println("1. Candidato 1");
                System.out.println("2. Candidato 2");
                System.out.println("3. Candidato 3");
                voto = scan.nextInt();
                switch (voto) {
                    case 1 ->
                        can1++;
                    case 2 ->
                        can2++;
                    case 3 ->
                        can3++;
                    default ->
                        System.out.println("Opcion invalida.");
                }
            }
        }
        final1 = final1 + can1;
        final2 = final2 + can2;
        final3 = final3 + can3;

        if (final1 > final2 || final1 > final3) {
            System.out.println("El candidato 1 gana con una cantidad de " + final1 + " votos");
        } else {
            if (final2 > final3 || final2 > final1) {
                System.out.println("El candidato 2 gana con una cantidad de " + final2 + " votos");
            } else {
                if (final3 > final2 || final3 > final1) {
                    System.out.println("El candidato 3 gana con una cantidad de " + final3 + " votos");
                }
            }
        }

    }
}
