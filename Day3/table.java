/*Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.  */

package Day3;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        for (int i = 1; i <=10; i++) {
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
