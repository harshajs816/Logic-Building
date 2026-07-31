

import java.util.Scanner;

public class printNStar{

    public static void printStar(int num){
      
        if(num ==0 ){
            return;
        }
        printStar(num-1);
        System.out.print("*");
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("How much Star do you want to Print");
        int num = sc.nextInt();
        printStar(num);

        sc.close();
    }
    
    

}
