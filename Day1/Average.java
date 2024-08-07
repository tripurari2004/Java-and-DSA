/*In a program, input 3 numbers: A, B and C. You have to output the average of these 3 numbers.
(Hint: Average of N numbers is sum of those numbers divided by N) */ 


package Day1;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int average = (a+b+c)/3;
        System.out.println("Avearage = "+average);
    }
    
}