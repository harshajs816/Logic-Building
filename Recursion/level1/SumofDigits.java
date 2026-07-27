public class SumofDigits{


    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int lastDigit = (n % 10);
        int remaning = (n / 10);

        return lastDigit + sum(remaning);

    }

    public static void main(String[] args) {
         System.out.println(sum(1234));
    }
}