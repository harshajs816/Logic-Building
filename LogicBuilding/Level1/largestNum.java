import java.util.Scanner;

public class largestNum {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num1 :-");

        int Num1 = sc.nextInt();

           System.out.print("Enter Num2 :-");

         int Num2 = sc.nextInt();   
         if (Num1 > Num2){
            System.out.println("Num 1 is larger then Num2");
         }
         else{
            System.out.println("Num2 is larger than Num1");
         }
    }
}
