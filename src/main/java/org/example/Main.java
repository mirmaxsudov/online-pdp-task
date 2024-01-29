package org.example;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(isPrime(i));
        }
    }

    private static boolean isPrime(int number) {
        for (int i = 2;  i <= Math.sqrt(number); i++)
            if (number % i == 0)
                return false;

        return true;
    }
}