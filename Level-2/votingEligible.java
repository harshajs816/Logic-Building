public class votingEligible {

    public static void eligible(int age){
         if(age>=18){
            System.out.println("You are eligible for voating");
         }
         else if (age<=0){
            System.out.println("Enter Correct age");
         }
         else{
            System.out.println("You are not eligible for voating");
         }
    }

    public static void main(String[] args) {
        int age = -1;
        eligible(age);
    }
    
}
