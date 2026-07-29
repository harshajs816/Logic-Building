public class productOfDigits {

      static int pro = 1;
    public static int product(int num){

        if(num==0){
            return pro;
        }

      int digit = num%10;
      pro = 1*pro * digit;  

      return product(num/10);
    }

    public static void main(String[] args) {
        int num = 1234;
        int numProduct = product(num);
        System.out.println(numProduct);
    }
    
}
