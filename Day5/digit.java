/*Write a Java method to compute the sum of the digits in an integer */

package Day5;

import java.util.Scanner;

public class digit {

    public static int digitSum(int num){
        int sum = 0;
        while (num>0) {
            int lastDigit = num % 10;
            sum +=lastDigit;
            num /=10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        System.out.println(digitSum(num));
    }
}
