package org.paymentchaint.InfraestructuraDomain;

public class NumerosPrimos {
    public static void numeroPrimos(){
        int count = 0;
        int number = 2;

        System.out.print("Los primeros 10 números primos son:");

        while (count < 10) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }


    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
