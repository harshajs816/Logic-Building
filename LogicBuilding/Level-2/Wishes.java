import java.util.Scanner;

public class Wishes {
    public static void goodWishes(int time){
        if(time < 0 || time >=24){
            System.out.println("Enter Between 0 to 23");
            return;
        }

        if (time <=12){
            System.out.println("Good Morning Everyone");
        }else if(time <= 17){
            System.out.println("Good AfterNoon Everyone");
        }else if(time <=22){
            System.out.println("Good Evening Everyone");
        }else{
            System.out.println("Good Night Everyone");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Time according to 24hrs :");
        int time = sc.nextInt();
        goodWishes(time);
    }
}
