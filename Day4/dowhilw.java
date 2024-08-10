/*Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. The loop should ask the user whether he or she wishes to perform the operation again. If so, the loop should repeat; otherwise it should terminate.  */

package Day3;

import java.util.Scanner;

public class dowhilw {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int choice;

        do {
            num1=sc.nextInt();
            num2=sc.nextInt();
            int sum = num1+num2;
            System.out.println("Sum = "+ sum);
            System.out.print("Do you want to continue press 0? ");
            choice = sc.nextInt();
        } while (choice==0);

    }
}
