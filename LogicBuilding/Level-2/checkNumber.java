public class checkNumber {

    public static void checkNum(int num1 ,int num2){

        if(num1 %2 == 0 && num2 % 2 == 0){
                System.out.println("Both numbers are even");
        } else if(num1 %2 != 0 && num2 % 2 != 0){
           System.out.println("Both numbers are odd");
        }
        else{
            System.out.println("One number is even and other is odd");
        }
    }
    
    public static void main(String[] args) {
         int num1 = 3;
         int num2 = 4;
         checkNum(num1, num2);
    }
}
//(num1%2==0 && num2%2 !=0) ||( num1 % 2 !=0 && num2 % 2 == 0)