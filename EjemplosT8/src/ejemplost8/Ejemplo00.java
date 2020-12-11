/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplost8;

/**
 *
 * @author reroes
 */
public class Ejemplo00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        
        int n = 8;
        double suma = 0;
        double numerador;
        double denominador;
        for (int i = 2; i <= n; i++) {
            numerador = Math.pow(2, i);
            denominador = 2*i;
            suma = suma + (numerador/denominador);
                    
        }
        
        System.out.printf("Valor de la sumatoria %.4f\n", suma);
    }
    
}
