package Day12;

public class opps {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Red");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        BankAccount b = new BankAccount();
        b.username="tripurari";
      
    }
}


class Pen {

    private String color;
    private int tip;

    void setColor(String newColor){
        color=newColor;
    };

    String getColor(){
        return this.color;
    }

    void setTip(int newTip ){
        tip = newTip;
    }

    int getTip(){
        return this.tip;
    }
    
}

class BankAccount{
    public String username;
    private String password;
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy , int chem, int maths){
        percentage =(phy+chem+maths)/3;
    }
}