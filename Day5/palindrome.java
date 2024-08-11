/*Write a Java program to check if a number is a palindrome in Java? ( 121 is a
palindrome, 321 is not) */

package Day5;

import java.util.Scanner;

public class palindrome {

    public static int isPalindrome(int num){
        int reverseNum = 0;
        while (num>0) {
            int lastDigit = num%10;
            reverseNum = reverseNum*10+lastDigit;
            num = num/10;
        }

        return reverseNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        System.out.println(isPalindrome(num));
    }
}
