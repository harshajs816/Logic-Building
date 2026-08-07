public class AvgOfArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int sum =0;
     
        for(int i=0; i<=arr.length-1;i++){
           
            sum=sum+arr[i];
        }

        int avg = sum/(arr.length-1) ;
        System.out.print("Avg of numbers :"+" "+ avg);
    
    }
}
