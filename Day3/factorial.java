/*Write a program to find the factorial value of any number entered through the keyboard.  */

package Day3;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int fact = 1; 
       
        for(int i=1; i<=num; i++)
        {
            fact *= i;
        }
        
        System.out.println("Factorial of "+num+": "+ fact);
    }
}
