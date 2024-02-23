package Practice;

public class GreatestNum {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        int c = 40;
        int d;
        if (a > b) {
            d = a;
        } else {
            d = b;
        }
        if (d > c) {
            System.out.println("The greatest number is " + d);
        } else {
            System.out.println("The greatest number is " + c);
        }
    }
}
