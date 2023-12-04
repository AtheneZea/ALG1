/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment07_pole;

/**
 *
 * @author Kozak-J-9cb5
 */
public class MatrixTools {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] [] a={{1, 2, 3, 4},
                    {5, 6, 7, 8,},
                    {5, 4, 3, 2}
                    };
        System.out.println("maxAbs"+maxAbs(a));{
        //pole poli na ktere volam aplikace
        //prevedeni matice na normovany tvar{ten vynikne z puvodni matice tak, 
        //ze kazdy jeji prvek vydelime max abs
        //1.Najit max abs
        
    }
    public static int maxAbs(int[][]a){
    int maxAbs= Integer.MIN_VALUE;
    for (int i=0; i<a.length; i++){
        for(int j=0; j<a[i].length; j++){
            int absElement = Math.abs(a[i][j]);
            if(absElement>maxAbs){
                maxAbs=absElement;
            }
                
            }
        }
        return maxAbs;
    }
    public static double [ ] [ ] norm (int []
}
