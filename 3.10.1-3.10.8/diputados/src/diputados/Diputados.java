/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diputados;

import java.util.Scanner;

/**
 *
 * @author Ambiente 209-1
 */
public class Diputados {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variables
        int n, favor = 0, contra = 0, abs = 0, voto;
        float porcentaje1, porcentaje2, porcentaje3;

        System.out.println("Ingrese el número de diputados: ");
        n = scan.nextInt();

        do {
            System.out.println("¿Está a favor del tratado del libre comercio?");
            System.out.println("1. Si");
            System.out.println("2. No");
            System.out.println("3. Se abstiene");
            voto = scan.nextInt();

            switch (voto) {
                case 1:
                    favor++;
                    break;
                case 2:
                    contra++;
                    break;
                case 3:
                    abs++;
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;
            }

        } while ((favor + contra + abs) < n);

        porcentaje1 = (float) favor / (n * 100);
        porcentaje2 = (float) contra / (n * 100);
        porcentaje3 = (float) abs / (n * 100);
        porcentaje1 = (float) (porcentaje1 * 10000);
        porcentaje2 = (float) (porcentaje2 * 10000);
        porcentaje3 = (float) (porcentaje3 * 10000);

        System.out.println("Porcentaje de diputados a favor: " + porcentaje1 + "%");
        System.out.println("Porcentaje de diputados en contra: " + porcentaje2 + "%");
        System.out.println("Porcentaje de diputados que se abstenieron a votar: " + porcentaje3 + "%");
    }
}
