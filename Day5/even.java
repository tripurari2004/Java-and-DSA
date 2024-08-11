/*Write a method named isEven that accepts an int argument. The method
should return true if the argument is even, or false otherwise. Also write a program to test your
method.
 */

package Day5;

import java.util.Scanner;

public class even {

    public static boolean isEven(int num){
        if (num%2 ==0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();


        if (isEven(num)) {
            System.out.println(num+" is even number");
        } else {
            System.out.println(num+" is odd number");
        }
    }
}
