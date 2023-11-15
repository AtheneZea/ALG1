/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment06;

/**
 *
 * @author Kozak-J-9cb5
 */
public class arrayTools_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int [] b = new int[5]
        int [] b = {2,8,4,6,-5}; //staticky inicializat
    }
        // TODO code application logic here
    public static int sum(int[] a){
            int sum =0;
        for(int i=0; i<a.length; i=++){
            sum = sum + a[i];
}
            return sum;
            }
    public static void print (int[] a){
    for(int i=0; i<a.length; i=++){
        System.out.print(a[i] + "");
       
}
    public static void print2 (int[] a){
    for(int i=0; i<a.length; i=++){
        System.out.print(a[i] + "["); 
}