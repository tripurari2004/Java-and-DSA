package Day7;

public class maxsum {
    public static void printSubArraySum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum=0;
                for (int k = i; k <=j; k++) {
                    currSum+=arr[k];
                }
                System.out.println(currSum);
                if (maxSum<currSum) {
                    maxSum=currSum;
                };
            }
        }
        System.out.println("Max sum is: "+maxSum);
    }

    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        printSubArraySum(arr);
    }
}