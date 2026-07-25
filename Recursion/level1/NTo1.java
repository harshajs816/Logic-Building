package Recursion.level1;

/**
 * NTo1
 */
public class NTo1 {

    public static void printNumb(int n){
       
        // base Condition 
        if(n==1){
            System.out.print(" 1 ");
            return;
        }

        printNumb(n-1);
        System.out.print( n + " ");
    }
    public static void main(String[] args) {
        int n = 10;
        printNumb(n);
    }
    
}