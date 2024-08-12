package Day6;

public class linear {

    public static int linearSearch(int num[] , int key){
        for (int i = 0; i <num.length; i++) {
            if (num[i]==key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int key = 10;
        int num[]={2,4,6,7,8,10,12,14,16};
        int index = linearSearch(num, key);

        if (index==-1) {
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("key is at index: "+index);
        }
    }
}
