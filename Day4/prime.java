/*Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.  */

package Day3;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        boolean prime = true;

        for(int i=2;i<num;i++){
            if (num%i==0) {
                prime=false;
                break ;
            }

        }

        if(prime && num > 1)
        {
            System.out.println("Number is prime");
        }
	    else
        {
            System.out.println("Number is not prime");
        }
    }
}
