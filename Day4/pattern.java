/* 
   *
  ***
 *****
*******

*/


package Day4;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        for (int i = 1; i <=num; i++) {
            for (int j = num; j>i; j--) {
                System.out.print("  ");
            }
            for (int j= 1; j<=(2*i-1); j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
