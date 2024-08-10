/*Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321. */

package Day3;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        int reverse = 0;

        while (number>0) {
            int reminder = number%10;
            reverse = reverse*10+reminder;
            number /=10;
        }

        System.out.println(reverse);

    }
}
