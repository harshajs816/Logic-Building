public class sumOfOdd {
     
    public static int oddSum(int num){
        if(num==0){
            return 0;
        }

        if(num%2 !=0){
           return num + oddSum(num-1);
        }else{
          return  oddSum(num-1);
        }
    }

    public static void main(String[] args) {
       int num = 10;

       System.out.println(oddSum(num));
        }
}
