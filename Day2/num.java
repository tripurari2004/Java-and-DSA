/*Write a Java program to get a number from the user and print whether it is
positive or negative. */

package Day2;

import java.util.Scanner;

public class num {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        sc.close();

        if(number>=0){
            System.out.println(number+" is Postive");
        }else{
            System.out.println(number+" is negative");
        }
    }
}
