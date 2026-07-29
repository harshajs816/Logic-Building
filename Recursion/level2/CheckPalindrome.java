public class CheckPalindrome {
    static int rev=0;

    public static int palindrome(int num){

        if(num==0){
            return rev;
        }
        int digit = (num % 10);
         rev = rev * 10 + digit;
         
         return palindrome(num/10);
    }
    

    public static void main(String[] args) {

        int num = 11211;
    
        if(num==palindrome(num)){
            System.out.println("Number is Palindrome");
        }
    }
}
