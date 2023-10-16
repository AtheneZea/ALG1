/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignments01_introduction;

/**
 *
 * @author Kozak-J-9cb5
 */
public class Farm {
    public static void main(String[] args) {
        
    
    //vstupy
            
        int pocetHus =5;
        int pocetKraliku =4;
        final int pocetNohouKraliku =2;
        final int pocetNohouHus =2;
                
    //výpočty
        
        int pocetZvirat = pocetHus+pocetKraliku;
        int pocetNohou = pocetHus*pocetNohouHus+pocetKraliku*pocetNohouKraliku ;       
        
                
        System.out.println("Na farmě je "+pocetZvirat+" a mají dohromady "+pocetNohou+" nohou.");
                
                
                }}
    

