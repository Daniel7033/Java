/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package presion;

import java.util.Scanner;
/**
 *
 * @author Ambiente 209-1
 */
public class Presion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        double masa;
        double volumen;
        double presion;
        double temperatura;
        String respuesta;
        do{
            
            System.out.println("Vamos a hayar la masa de aire de las llantas");
            System.out.println("Ingrese el volumen");
            volumen= scan.nextDouble();
            System.out.println("Ingrese la presion");
            presion= scan.nextDouble();
            System.out.println("ingrese la Temperatura");
            temperatura= scan.nextDouble();
            masa=(presion*volumen)/(0.37*(temperatura+460));
            System.out.println("La masa de aire de la llanta es de: "+masa);
            System.out.println("Desea hayar la masa de ire de otra llanta");
            respuesta=scan.next();
        }while("si".equals(respuesta));
    }
    
}
