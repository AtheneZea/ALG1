/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignments04_sekvence;
import java.util.Scanner;
public class uloha04_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zadej počet členů posloupnosti (N): ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Neplatný počet členů posloupnosti.");
            return;
        }

        double suma = 0.0;
        int pocet = 0;

        for (int i = 1; i <= N; i++) {
            System.out.print("Zadej " + i + ". člena posloupnosti: ");
            double X = sc.nextDouble();
            suma += X;
            pocet++;
        }

        if (pocet > 0) {
            double prumer = suma / pocet;
            System.out.println("Průměr posloupnosti je: " + prumer);
        } else {
            System.out.println("Nelze vypočítat průměr, protože nebyly zadány žádné hodnoty.");
        }

        sc.close();
    
    }
   
}
