
package assignments03_ukoly;

import java.util.Scanner;

public class RodneCisloValidator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Načtení první části rodného čísla 9 číslic
        System.out.print("Zadejte první část rodného čísla (devítimístné číslo): ");
        int prvniCast = scanner.nextInt();
        
        // Načtení druhé části rodného čísla 9 číslic
        System.out.print("Zadejte druhou část rodného čísla (čtyřmístné číslo): ");
        int druhaCast = scanner.nextInt();

        // Výpočet zbytku po dělení prvních devíti číslic a číslem 11
        int zbytek = prvniCast % 11;

        // Ověření platnosti rodného čísla
        if (zbytek == 10) {
            // Pokud zbytek je 10, poslední číslice musí být 0
            if (druhaCast == 0) {
                System.out.println("Zadáno platné rodné číslo.");
            } else {
                System.out.println("Zadáno neplatné rodné číslo.");
            }
        } else {
            // Jinak je poslední číslice rovna zbytku
            if (druhaCast == zbytek) {
                System.out.println("Zadáno platné rodné číslo.");
            } else {
                System.out.println("Zadáno neplatné rodné číslo.");
            }
        }
    }
}

