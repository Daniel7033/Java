/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

/**
 *
 * @author Stork
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 0, num2 = 1, suma;
        
        for (int i = 1; i <= 100; i++) {
            System.out.println(num1 + "");
            
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
            if (num1 >= 100) {
                break;
            }
        }
    }
    
}
