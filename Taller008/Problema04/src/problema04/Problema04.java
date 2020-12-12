/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HOLA
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int n;
        double numerador;
        double denominador;
        double suma = 0;
        String cadena;
        System.out.println("Ingresar un número n(positivo): ");
        n = entrada.nextInt();
        if(n >= 0){
            for (int i = 1; i <=n; i++){
                numerador = Math.pow(-1,i);
                denominador = (2*i) + 1;
                suma = suma + (numerador / denominador);
            }
            cadena = String.format("Suma total de los elementos de la serie "
                    + "es: %f", suma);
        } else {
            cadena = "Error, número ingresado no válido.";
        }
        System.out.printf("%s\n", cadena);
    }
   
}