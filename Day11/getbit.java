package Day11;

public class getbit {

    public static int getIthBit(int num,int i){
        int bitMask = 1<<i;
        if ((num&bitMask)==0) {
            return 0;
        }
        else{
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(getIthBit(10,3));
    }
}
