/**
 A client program for the RightTriangle class.
 Input: two numbers from the standard input.
 - the first number is the size of the base of a right triangle.
 - the second number is the size of the height of the right triangle.
 Output: the program shows a comma separated list of four values: 
   the base, height, hypotenuse, and area of the right triangle.

 Example:
 $ java RightTriangleClient 
 3 4
 3.00,4.00,5.00,6.00
*/
import java.util.Scanner;

public class RightTriangleClient {
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      double base = scn.nextDouble();
      double height = scn.nextDouble();
      
      RightTriangle tri = new RightTriangle(base, height);
      double area = tri.calcArea();
      double hypotenuse = tri.calcHypotenuse();

      System.out.printf("%.2f,%.2f,%.2f,%.2f\n", tri.getBase(), tri.getHeight(), hypotenuse, area);
   }
}
