package Recursion.level1;

public class factorial {

    public static int fact(int n){

        if(n==1){
            return 1;
        }

        int fnm1= fact(n-1);

        return n*fnm1;

    }
    
    public static void main(String[] args) {
        
        System.out.print(fact(5));
    }
}
