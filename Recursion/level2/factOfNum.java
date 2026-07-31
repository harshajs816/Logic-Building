import java.util.Scanner;

public class factOfNum {

    public static void factorial(int num , int div){

        if(num==div){
           System.out.println(num + " ");
            return;
        }

        if(num%div==0){
            System.out.print(div +" ");
            factorial(num,div+1);
            return;
        }
        else{
            factorial(num, div+1);
        }
    }
    

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter any number :");
        int num = sc.nextInt();

        factorial(num, 2);
        
    }
}
