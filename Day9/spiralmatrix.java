package Day9;

public class spiralmatrix {

    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int stratCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while (startRow<=endRow && stratCol<=endCol) {

            for(int j=stratCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }

            for(int j=endCol-1;j>=stratCol;j--){
                if (startRow==endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }

            for(int i=endRow-1;i>=startRow+1;i--){
                if (stratCol==endCol) {
                    break;
                }
                System.out.print(matrix[i][stratCol]+" ");
            }

            startRow++;
            stratCol++;
            endCol--;
            endRow--;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSpiral(matrix);
    }
    
}
