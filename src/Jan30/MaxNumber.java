package Jan30;

public class MaxNumber {
    public static void main(String[] args) {
        int[] numbers = {10, 30, 43, 54, 23, 543, 43, 32};

        //Calling the methods
        reverseArray(numbers);
        int sum = sumArray(numbers);
        int maxNumber = findMaxNumber(numbers);
        int minNumber = findMinNumber(numbers);
        int secondMaxNumber = findSecondMaxNumber(numbers);
        int secondMinNumber = findSecondMinNumber(numbers);
        double average = calculateAverage(numbers);
        bubbleSort(numbers);

        //Printing the methods
        System.out.print("Reversed array:  ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        // System.out.println(/n);
        System.out.println("\r\nThe maximum number in the array is: " + maxNumber);
        System.out.println("The minimum number in the array is: " + minNumber);
        System.out.println("The second maximum number in the array is: " + secondMaxNumber);
        if (secondMinNumber == Integer.MAX_VALUE) {
            System.out.println("A second minimum number does not exist.");
        } else {
                        System.out.println("The second minimum number in the array is: " + secondMinNumber);
        }
        System.out.println("The sum of all elements in the array is: " + sum);
        System.out.println("The average of the array is: " + average);
        System.out.print("Sorted array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

    }

    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findMinNumber(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static int findSecondMaxNumber(int[] array) {
        int max;
        int secondMax;
        if (array[0] > array[1]) {
            max = array[0];
            secondMax = array[1];
        } else {
            max = array[1];
            secondMax = array[0];
        }
        for (int i = 2; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax && array[i] != max) {
                secondMax = array[i];
            }
        }
        return secondMax;
    }

    public static int findSecondMinNumber(int[] array) {
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < min) {
                secondMin = min;
                min = value;
            } else if (value < secondMin && value != min) {
                secondMin = value;
            }
        }
        return secondMin;
    }
    public static double calculateAverage(int[] array) {
              double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }
    public static void bubbleSort(int[] array) {
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then break
            if (!swapped) break;
        }
    }
}
