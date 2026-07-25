package Recursion.level1;

public class PrintNnumbers {

    public static void printNum(int n){
        if(n ==1){
        System.out.print(" 1 ");
        return;
        }

      printNum(n-1);
      System.out.print(n + " "); 
    }

    public static void main(String[] args) {
        int n=10;
    printNum(n);
        
    }
    
}
