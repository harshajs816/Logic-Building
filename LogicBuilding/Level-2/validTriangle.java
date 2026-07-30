
// Problem --> Take three sides and check if they form a valid triangle

// Logic :-------------
//     The sum of the lengths of any two sides must be greater than the length of the third side.
//          Mathematically, if the sides are a, b, and c, then:
//                    a+b>c
//                    a+c>b
//                    b+c>a
//  If all three conditions are true, the three sides can form a valid triangle. Otherwise, they cannot.
//----------------------------------------------------------------------------------------------------------
public class validTriangle{

 public static Boolean validTri(int a,int b , int c){

        if(a+b> c && b+c > a && a+c>b){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int a =3;
        int b =4;
        int c=5;
        if (validTri(a, b, c)){
            System.out.println("Triangle is Valid");
        }
        else{
            System.out.println("Triangle is not Valid");
        }
    }
}