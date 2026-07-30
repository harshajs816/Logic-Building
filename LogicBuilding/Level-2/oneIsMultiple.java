import java.util.Scanner;

public class oneIsMultiple {

    public static void isMultiple(int Num1 , int Num2){

        if(Num1==0 || Num2==0){
             System.out.println("Cannot determine because one of the numbers is zero.");
              return;
        }
        if((Num1 % Num2 == 0) || (Num2 % Num1 ==0)){
            System.out.println("Numbers are multiple of other");
        }else{
            System.out.println("Numbers are not multiple of other");
        }

    }
  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num1:");
        int Num1= sc.nextInt();
        System.out.print("Enter Num2:");
        int Num2=sc.nextInt();

        isMultiple(Num1, Num2);


    }
    
}
