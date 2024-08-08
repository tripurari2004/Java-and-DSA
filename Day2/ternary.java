/*/*Write a Java program to get a number from the user and print whether it is
true or false for positive or negative numbers respectively using Ternary Operator. */

package Day2;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        sc.close();

        boolean result = (num>=0) ? true : false;
        System.out.println(result);

    }
}
