/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template

 */
package examen;

import java.util.Scanner;

/**
 *
 * @author Stork
 */
public class Examen {

    /**
     * @param args the command line arguments ---------* Suponiendo que
     * paranivelar el promedio de las calificaciones debe ser menor a 3.0,
     * aquellos que tienen más que eso no tienen derecho a la nivelacion porque
     * ya van bien *---------
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int estu = 0;
        float nota1, nota2, nota3, nota4, nota5, nfinal;
        while (estu < 40) {
            estu++;
            System.out.println("Estudiante " + estu);
            if (estu <= 40) {
                System.out.println("Unidad 1");
                nota1 = scan.nextFloat();
                System.out.println("Unidad 2");
                nota2 = scan.nextFloat();
                System.out.println("Unidad 3");
                nota3 = scan.nextFloat();
                System.out.println("Unidad 4");
                nota4 = scan.nextFloat();
                System.out.println("Unidad 5");
                nota5 = scan.nextFloat();
                nfinal = (float) ((nota1 + nota2 + nota3 + nota4 + nota5) / 5);
                if (nfinal < (float) 3.0) {
                    System.out.println("El estudiante tiene derecho al examen de nivelación.");
                } else {
                    System.out.println("El estudiante no tiene derecho al examen de nivelación.");
                }
            }
        }
    }

}
