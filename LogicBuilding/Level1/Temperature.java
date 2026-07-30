import java.util.Scanner;

public class Temperature {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Give Temperature in Degree -:");

        int Temperature = sc.nextInt();

        if(Temperature < 10){
            System.out.println("Temperature is cold");
        }
        else if( Temperature <= 34 ){
         System.out.println("Temperature is Warm");
        } 
        else {
            System.out.println("Temperature is HOT");
        }
        sc.close();
    }

}
