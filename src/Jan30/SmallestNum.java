package Jan30;

public class SmallestNum {

    public class Main {
        public static void main(String[] args) {
            // Define a 2D array
            int[][] my2DArray = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            // Iterate through the array using nested for loops
            for (int i = 0; i < my2DArray.length; i++) {      // Loop through rows
                for (int j = 0; j < my2DArray[i].length; j++) { // Loop through columns
                    System.out.print(my2DArray[i][j] + " ");
                }
                System.out.println(); // New line after each row
            }
        }
    }

}
