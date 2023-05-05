/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroventas;

import java.util.Scanner;

public class RegistroVentas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cantidad_total_ventas = 0;
        double cantidad_total_iva = 0;
        double cantidad_total_dinero_recibido = 0;
        boolean hay_clientes = true;
        
        while (hay_clientes) {
            System.out.print("Ingrese el monto de la venta: ");
            double monto_venta = input.nextDouble();
            double iva = monto_venta * 0.16;
            double total_pagar = monto_venta + iva;
            
            System.out.println("El IVA es: " + iva);
            System.out.println("El total a pagar es: " + total_pagar);
            
            System.out.print("Ingrese la cantidad con la que paga el cliente: ");
            double dinero_recibido = input.nextDouble();
            double cambio = dinero_recibido - total_pagar;
            
            System.out.println("El cambio es: " + cambio);
            
            cantidad_total_ventas += monto_venta;
            cantidad_total_iva += iva;
            cantidad_total_dinero_recibido += dinero_recibido;
            
            System.out.print("¿Hay más clientes? (s/n): ");
            String respuesta = input.next();
            if (respuesta.equalsIgnoreCase("n")) {
                hay_clientes = false;
            }
        }
        
        System.out.println("La cantidad total de ventas es: " + cantidad_total_ventas);
        System.out.println("La cantidad total de IVA es: " + cantidad_total_iva);
        System.out.println("La cantidad total de dinero recibido es: " + cantidad_total_dinero_recibido);
        System.out.println("La cantidad de dinero en caja es: " + (cantidad_total_dinero_recibido - cantidad_total_ventas));
    }
}