import java.util.Scanner;

public class largerFromthree {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num1 -:");
        int Num1 = sc.nextInt();

        System.out.print("Enter Num2 -:");
        int Num2 = sc.nextInt();

        System.out.print("Enter Num3 -:");
        int Num3 = sc.nextInt();

        if (Num1 > Num2 && Num1 > Num3){
                System.out.println("Num1 is larger than Num2 and Num3");
        
        }
        else if(Num2 > Num1 && Num2 > Num3){
            System.out.println("Num 2 is greater than Num1 and Num3");
        } 
     else{
        System.out.println("Num3 is greater than Num1 and Num2");
     }
    }
}