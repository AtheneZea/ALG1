/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week03;

import java.util.Scanner;

/**
 *
 * @author Kozak-J-9cb5
 */
public class Speed {
  public static void main(String[] args) {

        /*Zapište program, který pro zadanou celočíselnou hodnotu představující částku v korunách určí výčetku platidel,
tedy počet bankovek a mincí, kterými lze zadanou sumu zaplatit. Ve svém programu se omezte na bankovky
a mince v hodnotě 100, 50, 20, 10, 5, 2 a 1 Kč.*/
        //in
        double distanceKm;
        int maxSpeedKm;
        
        int inHour;
        int inMin;
        int inS;
        
        int outHour;
        int outMin;
        int outS;
        
        double averageSpeed;
        boolean PayFine;
        
        System.out.print("Zadej parametry:");
        
        Scanner sc = new Scanner(System.in);
        //in sum
        
        //vypočet
        int bankovka100=0;
        int mince50=0;
        int mince20=0;
        int mince10=0;
        int mince5=0;
        int mince2=0;
        int mince1=0;
        
        bankovka100 = money/100;
        money = money % 100;
        mince50 = money/50;
        money = money % 50;
        mince20 = money/20;
        money= money%20;
        mince10=money/10;
        money=money%10;
        mince5=money/5;
        money=money%5;
        mince2=money/2;
        money=money%2;
        mince1=mince1/1;
        money=money%1;
                
        //out
        
        System.out.println("Máte - " + inputMoney + " Korun českých.");
        System.out.println( "Bankovky 100 - " + bankovka100 + "," 
                + "Mince 50 - "  + mince50 + "," 
                + "Mince 20 - " + mince20 + "," 
                + "Mince 10 - " + mince10 + "," 
                + "Mince 5 - " + mince5 + "," 
                + "Mince 2 - " + mince2 + "," 
                + "Mince 1 - " + mince1  );        
        
        
    }  
}
