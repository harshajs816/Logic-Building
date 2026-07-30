import java.util.Scanner;

public class leapYear {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a naumber :-");

     int year = sc.nextInt();
     if(year % 400 ==0 || (year%4==0 && year%100 !=0)){
        System.out.println("year is leap Year");
     }
     else{
        System.out.println("year is not leap year");
     }
    }
}
