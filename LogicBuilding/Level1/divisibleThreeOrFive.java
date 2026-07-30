import java.util.Scanner;

public class divisibleThreeOrFive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number :-");
     int number = sc.nextInt();

     if (number % 5 ==0 && number % 3 ==0){
           System.out.println("Number is divisible by both 5 and 3 ");
     }else{
        System.out.println("Number is not divisible by both 3 & 5 ");
     }
        
    }
    
}
