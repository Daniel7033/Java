/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicacion;

import java.util.Scanner;
/**
 *
 * @author Stork
 */
public class Multiplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // TODO code application logic here
        int m;
        System.out.print("Tabla del: ");
        m = scan.nextInt();
        for (int n = 0, r = 0; n <= 10; n++, r+=m) {
            System.out.println(m+" * " + n + " = "+r);
        }

    }

}
