package assignents04_sekvence;

import java.util.Scanner;

public class ulohy04_06pocet_prvocisel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nPrime = 0;//počet prvočsel
        int number;//načtené číslo
        boolean isPrime = true;
        System.out.println("Zadejte kladná čísla ukonči 0 nebo minusem :");
        while ((number = sc.nextInt()) > 0) {
            if (number < 2) {
                isPrime = false;
            } else {
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

            }
            if (isPrime) {
                nPrime++;
            }

            isPrime = true; //reset isPrime pro další iteraci
        }
        System.out.println("Počet prvočísel je: " + nPrime + ".");
    }
}
