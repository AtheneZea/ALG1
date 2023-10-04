/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignments02_numbers;

/**
 *
 * @author jaryna
 */
    import java.util.Scanner;

public class AlkoholovyVypocet {
    // Definice konstant
    static final double RHO = 0.8;   // Hustota ethanolu v g/cm^3
    static final double R_MUZ = 0.7; // Podíl vody v těle muže
    static final double R_ZENA = 0.6; // Podíl vody v těle ženy
    static final double BETA_MUZ = 0.1; // Rychlost odbourávání alkoholu u muže v g/hod
    static final double BETA_ZENA = 0.085; // Rychlost odbourávání alkoholu u ženy v g/hod

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Získání vstupních hodnot od uživatele
        System.out.print("Zadejte objem vypitého nápoje (ml): ");
        double Q = scanner.nextDouble();

        System.out.print("Zadejte podíl alkoholu ve vypitém nápoji: ");
        double p = scanner.nextDouble();

        System.out.print("Zadejte tělesnou hmotnost konzumenta (kg): ");
        double mkonzument = scanner.nextDouble();

        System.out.print("Zadejte čas po konzumaci (hodiny): ");
        double t = scanner.nextDouble();

        // Výpočet hmotnosti vypitého ethanolu
        double mEt = (Q * p * RHO) / 100;

        // Výpočet promile alkoholu v krvi po konzumaci
        double promile = mEt / (mkonzument * (R_MUZ /* nebo R_ZENA */));

        // Výpočet rychlosti odbourávání alkoholu v těle konzumenta
        double beta = (mkonzument * (R_MUZ /* nebo R_ZENA */)) * (t * (R_MUZ /* nebo R_ZENA */ == R_MUZ ? BETA_MUZ : BETA_ZENA));

        // Výpočet času, za jak dlouho bude uživatel střízlivý (0.02 promile) v hodinách
        double casStrezlivost = (promile - 0.02) / beta;

        // Zaokrouhlení nahoru na celé hodiny
        int hodiny = (int) Math.floor(casStrezlivost);

        // Výpočet minut
        int minuty = (int) ((casStrezlivost - hodiny) * 60);

        // Výpis výsledků v hodinách a minutách
        System.out.println("Hmotnost vypitého ethanolu: " + mEt + " g");
        System.out.println("Promile alkoholu v krvi po konzumaci: " + promile);
        System.out.println("Rychlost odbourávání alkoholu: " + beta + " g/hod");
        System.out.println("Čas, za jak dlouho bude uživatel střízlivý (0.02 promile): " + hodiny + " hodin " + minuty + " minut");

        // Uzavření scanneru
        scanner.close();
    }
}
    

