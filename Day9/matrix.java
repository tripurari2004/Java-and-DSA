package Day9;

import java.util.Scanner;

public class matrix {

    public static void search(int matrix[][],int key){
        boolean found = false;
        for (int[] n : matrix) {
            for (int m :n) {
                
                if(m==key){
                    found = true;
                }
                
            }
        }

        if (found) {
            System.out.println("Element Found");
        }else{
            System.out.println("Element not found");
        }
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }

        for (int[] n : matrix) {
            for (int m : n) {
                System.out.print(m+" ");
            }
            System.out.println();
            
        }

        search(matrix, 5);
    }
}
