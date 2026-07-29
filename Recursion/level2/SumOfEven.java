public class SumOfEven {
    
    public static int evenSum(int num){

        if(num==0){
            return 0;
        }


        if(num%2==0){
         return num + evenSum(num-1);
        }else{
            return evenSum(num-1);
        }
    }

    public static void main(String[] args) {

        System.out.println(evenSum(10));
        
    }
}
