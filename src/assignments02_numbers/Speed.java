/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignments02_numbers;

import java.util.Scanner;

/**
 *
 * @author Kozak-J-9cb5
 */
public class Speed {
  public static void main(String[] args) {

        //in
        double distanceKm =50;
        int maxSpeedKmH =50;
        
        int inHour=12;
        int inMin=0;
        int inSec=0;
        
        int outHour=12;
        int outMin=16;
        int outSec=0;
        
        double averageSpeed = 0;
        double difference;
        boolean PayFine;
        //int InSecAll=inHour*3600+inMin*60+inSec;
        int inSecAll=timeToSec (inHour, inMin, inSec);
        //int outSekAll=outHour*3600+outMin*60+outSec;
        int outSecAll =timeToSec (outHour, outMin, outSec);
        double timeH = (double) (outSecAll-inSecAll)/3600;
        difference = maxSpeedKmH - averageSpeed;
      boolean payFine = difference<0;
      //zbytečné
      //if(differecnce<0){
      //payFine=true;
      //}else{
      //payFine=false;
          
            
            //ternární operátor!!!!!!!
            System.out.println(((payFine)?"Budeš ":"Nebudeš ")+"platit pokutu.");
                if(payFine){
                    System.out.println("Budeš platit pokutu.");
                }else {
                    System.out.println("Nebudeš platit pokutu.");
                }
       
            
        System.out.format("Tvoje průměrná rychlost je %.2f km/h\n:", averageSpeed);
  }
        public static int timeToSec (int hour, int min, int sec){
        
            return hour*3600+min*60+sec;
              
        
        
    }  
}
