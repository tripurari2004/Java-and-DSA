/*In a program, input the side of a square. You have to output the area of the square
(Hint: area of a square is (side x side)) */

package Day1;

import java.util.Scanner;

public class AreaSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float side = sc.nextFloat();
        sc.close();

        float area = side*side;
        System.out.println("Area = "+area);
    }
}
