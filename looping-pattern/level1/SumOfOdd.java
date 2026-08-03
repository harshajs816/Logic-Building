public class SumOfOdd {

    public static int printSumOfOdd(int num,int sum){
        for(int i =0; i<=num ; i++){
            if(i%2 != 0 ){
                sum = sum +i;
            }
        }
        return sum;
    }
    

    public static void main(String[] args) {
        int num = 20;
        int sum =0;
        System.out.println(printSumOfOdd(num,sum));
    }
}
