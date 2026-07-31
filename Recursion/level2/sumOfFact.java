import java.util.Scanner;

public class sumOfFact {

    public static int sumFact(int num,int div){
        
        if(num==div){
            return div;
        }

        if(num%div==0){
           return div + sumFact(num, div+1);
    }else{
        return sumFact(num, div+1);
    }

    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");

        int num = sc.nextInt();
      System.out.println(sumFact(num, 2));
    }
    
}
