/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignments03_ukoly;

/**
 *
 * @author jaryna
 */
public class SpeedLimit {

    public static void main(String[] args) {
        double distanceKm = 50;
        int maxSpeedKmH = 50;
        int inHour = 12;
        int inMin = 0;
        int inSec = 0;
        int outHour = 13;
        int outMin = 0;
        int outSec = 0;

        double averageSpeed;
        boolean payFine;

        //int inSecAll = inHour*3600 + inMin*60 + inSec;
        //int outSecAll = outHour*3600 + outMin*60 + outSec;
        int inSecAll = timeToSec(inHour, inMin, inSec);
        int outSecAll = timeToSec(outHour, outMin, outSec);

        //přetypování jednoho operanda na double z toho vyplývá reálné dělení
        double timeH = (double)(outSecAll - inSecAll)/3600;
        averageSpeed = distanceKm / timeH;

        System.out.format("Tvoje průměrná rychlost je %.2f km/h\n", averageSpeed);

    }

    public static int timeToSec(int hour, int min, int sec) {
        return hour * 3600 + min * 60 + sec;
    }
}
