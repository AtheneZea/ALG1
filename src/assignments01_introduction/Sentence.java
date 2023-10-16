/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignments01_introduction;

import java.util.Scanner;

/**
 *
 * @author Kozak-J-9cb5
 */

public class Sentence {
   

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        //vstupy /int
   
        
        
        String 
                name = "Filip";//napevno v kodu
        System.out.println("Zadej jméno!");
                name = sc.next(); //nactení od uzivatele
                //String name = args[0];//jako argument pri spusteni
        
        
        
        int yearOfBirth = 2009;
        char className ='C';
        final int currentYear = 2023; // nelze jí přepsat
        final int yearToSchool = 6;

        //Výpočty /Processing
        int age = currentYear - yearOfBirth;
        int classGrade = age - yearToSchool; 

        //Výpis   /out            
        System.out.println("Dítě " + name + " má " + age + " let a chodí do "+ classGrade + "." + className);

           
        }}
