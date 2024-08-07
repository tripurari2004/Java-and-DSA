/*Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser You have to output the total 
cost of the items back to the user as their bill (Add on: You can also try adding 18% gst tax to the items in the bill as an 
advanced problem) */

package Day1;

import java.util.Scanner;

public class GST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencilCost = sc.nextFloat();
        float penCost = sc.nextFloat();
        float eraserCost = sc.nextFloat();
        sc.close();

        float Cost = pencilCost+penCost+eraserCost;
        float GST = (float)(Cost*0.18);
        float totalCost = Cost+GST;
        System.out.println("Total Cost after adding 18% GST ="+totalCost);
    }
}
