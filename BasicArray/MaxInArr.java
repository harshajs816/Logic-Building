public class MaxInArr{
    public static void main(String[] args) {
        int arr[]={3,4,5,9,8,7,6,5};
        int max =0;

        for(int i=0;i<=arr.length-1;i++){
        if(max<arr[i]){
            max = arr[i];
        }
        }
 System.out.println("Maximum Number is :"+ max);
    }
}