import java.util.Scanner;

public class GratestoftwoNo {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    {
        if (a == b) {
            System.out.println("number is equall");
        } else {
            System.out.println(Math.max(a, b) + " is gratest among them");
        }
    }
    public static void main(String[] args) {
       new GratestoftwoNo();
    }
}
