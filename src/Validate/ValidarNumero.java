package Validate;

import java.util.Scanner;

public class ValidarNumero {
    
    //numero entero
     public static boolean validaNumeroEntero_Exp(String texto) {
        return texto.matches("^-?[0-9]+$");
    }
     
    //numero real
    public static boolean validaNumeroReal_Exp (String texto) {
        return texto.matches ("^-?[0-9]+([\\.,][0-9]+)$");
    }
    
    //corroborar que un numero este en un parametro
    public static int validdaNumeroEnParametro (int minimo, int maximo) {
        
        Scanner sc = new Scanner (System.in);
        
        if (minimo > maximo) {
            int aux = minimo;
            minimo = maximo;
            maximo = aux;
        }
        
        int numero;
        do {
            
            System.out.println("Escribe un numero");
           numero = sc.nextInt();
        
        if (!(numero>= minimo && numero <= maximo)) {
            System.out.println("Debes escribir un numero entre " + minimo + " y " +maximo);
        }
        
        }while (!(numero >= minimo && numero <= maximo));
        
        return numero;
        }
    
    //generar numero aleatorio
    public static int generateRandomNumber(int minimo, int maximo) {
        return (int) ((Math.random() * (maximo - minimo + 1)) + (minimo));
    }
}
