/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema01;

/**
 *
 * @author HOLA
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palabra = "Universidad";
        char letra;
        for (int i = 0; i < palabra.length(); i++) { 
            letra = palabra.charAt(i);
            for (int j = 0; j <= i; j++) {
                System.out.printf("%s",letra );
            }
            System.out.println();
        }
        }
    }
    
    
