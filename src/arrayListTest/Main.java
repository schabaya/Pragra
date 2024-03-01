package arrayListTest;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1001, 200, 350, 140, 50, 60, 232};

        // 1. Find the max element using MaxElement class
        int maxElement = MaxElement.findMaxElement(arr);
        System.out.println("Max Element: " + maxElement);

        // 2. Swap two array elements using SwapElement class
        // Swapping the second element (200) with the last element (232)
        SwapElements.swapElements(arr, 1, arr.length - 1);

        // Print the array after swapping
        //System.out.print("Array after swapping: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
      //  System.out.println("]");
    }
}