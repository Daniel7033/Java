/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;
import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double cantidad_total_ventas = 0;
        int numero_clientes_atendidos = 0;
        boolean hay_clientes = true;
        
        while (hay_clientes) {
            System.out.print("Ingrese el monto total de la compra del cliente: ");
            double monto_total_compra = input.nextDouble();
            cantidad_total_ventas += monto_total_compra;
            numero_clientes_atendidos++;
            
            System.out.print("¿Hay más clientes? (s/n): ");
            String respuesta = input.next();
            if (respuesta.equalsIgnoreCase("n")) {
                hay_clientes = false;
            }
        }
        
        System.out.println("La cantidad total de ventas es: " + cantidad_total_ventas);
        System.out.println("El número de clientes atendidos es: " + numero_clientes_atendidos);
    }
    
}
