package Day11;

public class setBit {

    public static int setIthBit(int num,int i){
        int bitMask=1<<i;
        return num|bitMask;
    }

    public static void main(String[] args) {
        System.out.println(setIthBit(10, 2));
    }
    
}
