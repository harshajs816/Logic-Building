package Recursion.level1;

public class sumOfNum {

    public static int sumofNum(int n){
       if (n==1) {
         return 1;
       }
       
     return n + sumofNum(n-1);
    
    }
    
    public static void main(String[] args) {

       System.out.print( sumofNum(20));
    }
}
