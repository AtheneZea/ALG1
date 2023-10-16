package assignments03_ukoly;

import java.util.Scanner;

public class cykly_18 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        //Zapište program, který bude zpracovávat sadu zadaných kladných čísel. 
        //Program má postupně zjistit počet a součet 
        //a následně i průměr zadaných čísel. 
        //Zadávání bude ukončeno uživatelem zadáním nulové nebo záporné hodnoty. 
        //Jaké jsou rozdíly při výpočtu průměru z celých nebo reálných čísel?

        //vstupy... kladná čísla... zadej kladná čísla
        Scanner scanner = new Scanner(System.in);

        // Načtení prvního čísla
        System.out.print("Zadejte číslo: ");

        double zadaneCislo = scanner.nextDouble();

        double soucet = 0;
        double zadanecislo = 0;
        double pocetKroku=0;
        double prumer;
        System.out.print("Zadejte číslo: ");
                
        while (zadaneCislo > 0) {

            soucet = zadaneCislo + soucet;
            pocetKroku++;//přidává počet kroků o 1
            zadaneCislo = scanner.nextDouble();
            
        }
        int pocekKroku;
    

        //proces... program sčítá postupně čísla průměr
        //pokud uživatel zadá nulovou nebo zápornou hodnotu, tak bude zadávání 
        //ukončeno a vypocitam prumer
        
            prumer=soucet/pocetKroku;
                    System.out.format("Součet čísel je "+soucet+ " a jejich průměr je %.2f.",prumer);
                            
    }
}
