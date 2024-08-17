// Given an 0-indexed array of integers arr[] of size n, find its peak element and return it's index. An element is considered to be peak if it's value is greater than or equal to the values of its adjacent elements (if they exist).

package Day10;

public class index {

    public static int searchIndex(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                return i+1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 1};
        System.out.println(searchIndex(arr));
    }
    
}
