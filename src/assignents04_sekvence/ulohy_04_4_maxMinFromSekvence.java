/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignents04_sekvence;

import java.util.Scanner;
/**
 *
 * @author Kozak-J-9cb5
 */
public class ulohy_04_4_maxMinFromSekvence {
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Zadej počet čísel");
        int n= sc.nextInt();
        int number; //deklarace mimo cyklus
        int max=Integer.MIN_VALUE;
        int nMax = 0;
        int min = Integer.MAX_VALUE;
        int nEven = 0;
        
        // int max=0;.... pokud by to bylo pro kladná čísla
        
        System.out.println("Zadávej čísla");
        for(int i=0;i<n; i++) {
//iterační proměnná   dokud i bude menší než n tak to budu dělat, po každem kroku se ma i zvetsit
            number=sc.nextInt();
            if(number>max){
                max=number;
                nMax=1;
            }else if (number == max){
                nMax++;
            }
            if(number<min){
                min=number;
            }
            if(number%2==0){
            nEven++;
            }
            }
        if (n==0){ // limitni ale validni pripad
            System.out.println("Byla zadaná prázdná posloupnost. ");
        }else 
        {System.out.println("Max hodnota je " + max); 
        {System.out.println("Min hodnota je " + min); 
        {System.out.println("Počet sudých čísel je " + nEven); 
        {System.out.println("Počet výskytů max je " + nMax); 
        }
        }
        }
          
}

}
}