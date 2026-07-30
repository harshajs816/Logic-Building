import java.util.Scanner;

public class CheckCharacter {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Character");

       char ch = sc.next().charAt(0);

       if(Character.isUpperCase(ch)){
        System.out.println("Character is upperCase");
       }
       else if(Character.isLowerCase(ch)){
        System.out.println("Character is lowerCase");
       }
       else if(Character.isDigit(ch)){
        System.out.println("Character is Digit");
       }
       else{
        System.out.println("Character is a special Character");
       }
    }
}