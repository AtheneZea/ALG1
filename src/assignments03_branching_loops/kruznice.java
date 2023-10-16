/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignments03_branching_loops;

/**
 *
 * @author Kozak-J-9cb5
 */
public class kruznice {
    public static void main(String[] args) {
        //Napište program, který načte souřadnice bodu a parametry kružnice 
        //(souřadnice středu a poloměr) a určí vzájemnou pozici bodu a kružnice.
        //x2+y2=1
        
        double souradniceStreduX=1;
        double souradniceStreduY=1;
        double souradniceBoduX=2;
        double souradniceBoduY=1;
        double polomerKruznice=1;
        
        final double PRESNOST=0.0000000001;
        final int IN=1;
        final int ON=0;
        final int OUT= -1;
        
        int poloha;
        //zjstim delku vektoru
        
        double velikostVektoru = Math.sqrt((((souradniceBoduX-souradniceStreduX) ^ 2)+ ((souradniceBoduY-souradniceStreduY) ^ 2));
  
        //pokud je velikost vektoru menší než poloměr, tak bod leží uvnitř kružnice
        
                
        if (Math.abs(velikostVektoruNa2<((polomerKruznice)^2)));
                {
                    //System.out.println("Vektor leží uvnitř kružnice.");
                    poloha=IN;
                }
        else if (velikostVektoruNa2==(polomerKruznice)^2);
        {
            poloha=ON;
        }
        else 
                {
                        poloha=OUT
                    
                }
    
}
