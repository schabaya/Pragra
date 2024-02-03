package Practice;

public class ArrayaPrac {

    //approaches to print array data
    public static void main(String[] args) {
        int[] a = {10,20,30,40};
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println();

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
        for (int aa:a){
            System.out.println(aa);
        }
    }
}