// Problem : if the side is valid check triangle is Eqivalent , isosceles or scalene Triangle.
// logic :
//  Equilateral Triangle: All three sides are equal.
// Example: 5, 5, 5
// Isosceles Triangle: Exactly two sides are equal.
// Example: 6, 6, 4
// Scalene Triangle: All three sides are different.
// Example: 4, 5, 6
// Quick Table

/**
 * IdentifyTriangle
 */
public class IdentifyTriangle {

    public static void IdentifyTri(int a, int b, int c) {

        if (a == b && b == c) {
            System.out.println("Triangle is Equilateral");
        } else if (a == b || b == c || a == c) {
            System.out.println("Triangle is Isosceles");
        } else {
            System.out.println("Triangle is Scalene");
        }
    }

    public static void main(String[] args) {

        int a = 4;
        int b = 4;
        int c = 4;

        IdentifyTri(a, b, c);
    }
}