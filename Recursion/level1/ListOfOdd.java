

public class ListOfOdd {

    public static void oddNum(int n){
        if(n==1){
            System.out.print("1 ");
            return;
        }
        
        oddNum(n-1);

        if(n%2 !=0){
            System.out.print(n + " ");
        }

    }
    
    public static void main(String[] args) {
        int n=20;
        oddNum(n);

    }
}
