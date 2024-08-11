/*Write a Java method to compute the average of three numbers.. */

package Day5;

import java.util.Scanner;

public class average {

    public static double threeNumaverage(double a,double b,double c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();

        System.out.println(threeNumaverage(a,b,c));
    }
}
