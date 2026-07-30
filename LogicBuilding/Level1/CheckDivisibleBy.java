
import java.util.*;
public class CheckDivisibleBy {
    
    public static void main(String[] args) {
        int divider = 5;
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter Nubmer :");
        
      int number = sc.nextInt();

        if(number % divider == 0){
            System.out.println("Number is divisible by 5");
        }
        else {
            System.out.println("Not divisible by 5");
        }

    }
}
