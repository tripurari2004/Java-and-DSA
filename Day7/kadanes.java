package Day7;

public class kadanes {
    public static void printSubArraySum(int arr[]){
       int max=Integer.MIN_VALUE;
       int curr = 0;

       for (int i = 0; i < arr.length; i++) {
            curr += arr[i];
            if (curr<0) {
                curr=0;
            }
            max=Math.max(curr, max);
        }

        System.out.println("Max sum is : "+max);
    }

    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        printSubArraySum(arr);
    }
}
