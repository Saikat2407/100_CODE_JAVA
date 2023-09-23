package AdvanceQuestion;

public class child extends pratice{
    private int num = 22;

    public child(String c, int num) {
        super(c,num);
        this.num = num;

    }

    public child(int num) {
        this.num = num;
        System.out.println(num);
    }

    child(){
        super();
        System.out.println("Child class default constructor");
    }

    public static void main(String[] args) {
        child ch = new child("saiii",54);
    }
}