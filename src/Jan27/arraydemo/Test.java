package Jan27.arraydemo;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of fruit: ");
        String[] fruits = new String[5];

        for (int i = 0; i < fruits.length; i++) {

            fruits[i] = scanner.next();

            System.out.println(fruits[i]);

        }

    }
}

