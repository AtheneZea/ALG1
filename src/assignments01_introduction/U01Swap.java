package assignments01_introduction;

public class U01Swap {

    public static void main(String[] args) {
        int a = 34, b = 89;        
        //a)
        System.out.println(b + ", " + a);
        
        //b)
        
        int c = a;
        a = b;
        b = c; 
        System.out.println(a + ", " + b);
        
        //c)
        a = 34; b = 89;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + ", " + b);
               
        
       
        
        
    }
    
}
