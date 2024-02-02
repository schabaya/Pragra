package Jan30;
import java.util.Scanner;
public class ArrayDemo {
    public static void main(String[] args){

       Scanner scanner = new Scanner(System.in);
        int [] arr = new int[5];

        for (int i = 0; i< arr.length; i++){
            arr[i] = scanner.nextInt();

            for (int element : arr){

                System.out.println(element);
            }
        }
    }
}
