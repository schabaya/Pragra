package Jan30;

public class MaxNumber {
    public static void main(String[] args) {

        int[] numbers = {10, 30, 43, 54, 23, 543, 43, 32};
        int sum = sumArray(numbers);
        int maxNumber = findMaxNumber(numbers);
        int minNumber = findMinNumber(numbers);
        int secondMaxNumber = findSecondMaxNumber(numbers);
        System.out.println("The maximum number in the array is: " + maxNumber);
        System.out.println("The minimum number in the array is: " + minNumber);
        System.out.println("The sum of all elements in the array is: " + sum);
        System.out.println("The second maximum number in the array is: " + secondMaxNumber);
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
}
