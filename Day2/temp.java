/* Write a Java program so that it prints You have a fever if your temperature
is above 100 and otherwise prints You don't have a fever. */

package Day2;

import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        double temperature = sc.nextDouble();
        sc.close();

        if(temperature>100){
            System.out.println("You have a fever");
        }else{
            System.out.println("You don't have a fever");
        }
    }
    
}
