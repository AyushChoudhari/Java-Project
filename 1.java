class Thiskeyword {
    private int a = 4;
    private int b = 1;
    
    void getSum(int a,int b) {
        this.a = a;
        this.b = b;
        System.out.println(this.a + this.b);
    }
}
public class Java {
    public static void main(String args[]) {
        Thiskeyword T = new Thiskeyword();
        T.getSum(2,2)
    }
}

//Write a program to accept the age of a person and check whether he or she are eligible for vote or not by using frame.
