package org.paymentchaint.InfraestructuraDomain;


public class Palindromo {

    public static void palindromo(String palabra){

            if (esPalindromo(palabra)) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }
    }

    public static boolean esPalindromo(String cadena) {
        cadena = cadena.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i = 0;
        int j = cadena.length() - 1;

        while (i < j) {
            if (cadena.charAt(i) != cadena.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
