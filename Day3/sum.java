/*Write a program to calculate the sum of first n natural number. */

package Day3;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        sc.close();
        for (int i = 0; i <=n; i++) {
            sum +=i;
        }
        System.out.println(sum);
    }
}
