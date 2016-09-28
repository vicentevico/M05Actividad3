/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3;

import java.util.Scanner;

/**
 *
 * @author ALUMNEDAM
 */
public class Actividad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        final int preuUF = 30;
        int numUF = 0;
        boolean entero = false;
        
        System.out.println("Introduce el numero de UFs matriculadas");
        
        do{
            if(lector.hasNextInt()){
                numUF = lector.nextInt();
                if(numUF >=0){
                    entero = true;
                }else{
                    System.out.println("tiene que ser positivo");
                }
            }else{
                System.out.println("introduce un numero entero positivo");
                lector.next();
            }
        }while(!entero);
        
        calcularPrecio(numUF, preuUF);
        
    }
    
    public static void calcularPrecio(int numUF, int preuUF){
        int total;
        if(numUF>=12){
            System.out.println("Precio total = 380,00€");
        }else{
            total = numUF * preuUF;
            System.out.println("Precio total = " + total);
        }
    }
}
