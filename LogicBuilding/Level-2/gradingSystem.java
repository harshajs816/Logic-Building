import java.util.Scanner;

public class gradingSystem {

    public static void grade(int marks){

        if (marks <=40) {
                 System.out.println("Grade : F");
        }else if (marks <=55) {
            System.out.println("Grade: D");
        } else if(marks <=60){
                System.out.println("Grade: C");
        }else if (marks <=70){
            System.out.println("Grade: B");
        }else{
            System.out.println("Grade: A");
        }

    }

   
   
   
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your marks :");
        int marks = sc.nextInt();
        grade( marks);
      
    }
    
}
