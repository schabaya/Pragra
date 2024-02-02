package Jan27.arraydemo;

public class MultDArray {
    public static void main(String[] args) {
        int[][] myArray = {
                {1, 2},
                {3, 4},
                {5, 6}
        };
        int [][] array1 = {
                {54,12,4},
                {2,36,40},
                {6,4,5},
        };
        int [][] array2= {
                {2,9,40},
                {5,3,6},
                {3,5,12},
        };
                char[][] myCharArray = {
                {'A', 'B'},
                {'C', 'D'},
                {'E', 'F'}
        };

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
    }
    for (int i = 0; i < myCharArray.length; i++) {
        for (int j = 0; j < myCharArray[i].length; j++) {
            System.out.print(myCharArray[i][j] + " ");
        }
        System.out.println(); // New line after each row
    }
}

