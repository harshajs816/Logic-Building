

public class ListOfEven {

    public static void printEven(int n){
        
        //base Condition
        if (n <=0){
            return;
        }
        
        printEven(n-1);

    if (n % 2 ==0){
        System.out.print(n+" ");
    }

    }
    


    public static void main(String[] args) {
        int n = 20;
        printEven(n);
    }
}
