package assignments06;

public class arrayTools_02 {

    public static void main(String[] args) {
        //int[] b = new int[5];
        int[] b = {2, 8, 4, 6, -5}; //staticky inicializator
        int sum = arrayTools_02.sum(b);
        System.out.println(sum);
        print(b);
        print2(b);
        System.out.println()
        max(b);
    }
    
    public static int sum(int[] a){
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
           sum = sum + a[i];
       }
       return sum;
    }
    
    public static void print(int[] a){
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    
    public static void print2(int[] a){
        System.out.print("[");
        for(int i = 0; i < a.length-1; i++) {
                System.out.print(a[i] + ", ");
        }
        System.out.print(a[a.length-1]);
        System.out.println("]");
    }
    public static int max(int[] a) {
        int max =Integer.MIN_VALUE;
        for(int i=0; i<a.length;i++){
            if()
                }
        
    }
}