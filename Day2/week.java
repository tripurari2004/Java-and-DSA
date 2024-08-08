/*Write a Java program to input week number(1-7) and print day of week name
using switch case.*/

package Day2;

import java.util.Scanner;

public class week {
    public static void main(String[] args) {
        
        /*All Days are map with following numbers :- 
            
            Sunday ----> 0
            Monday ----> 1
            Tuesday ----> 2
            Wednesday ----> 3
            Thursday ----> 4
            Friday ----> 5
            Saturday ----> 6

        */

        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        sc.close();

        switch (day) {
            case 0:System.out.println("Sunday");
                break;

            case 1:System.out.println("Monday");
                break;
            
            case 2:System.out.println("Tueday");
                break;
            
            case 3:System.out.println("Wednesday");
                break;

            case 4:System.out.println("Thursday");
                break;

            case 5:System.out.println("Friday");
                break;

            case 6:System.out.println("Saturday");
                break;
            default:System.out.println("Enter right day");
                break;
        }

    }
}
