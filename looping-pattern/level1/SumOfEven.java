import java.util.Scanner;

public class SumOfEven {

    public static int sumOfEv( int num , int sum ){

     for(int i=0; i <= num; i++){
           
        if(i%2==0){
            sum = sum + i;
        }
     }
     return sum;
    }

    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
 
      System.out.print("Enter Number :");
      int num = sc.nextInt();
      int sum =0;
 System.out.println(sumOfEv(num, sum));
         
       
    }
    
}
