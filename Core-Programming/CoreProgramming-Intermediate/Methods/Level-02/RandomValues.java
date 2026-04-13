// Write a program that generates five 4 digit random values and then finds their average
// value, and their minimum and maximum value. Use Math.random(), Math.min(), and
// Math.max().
// Hint =>
// a. Write a method that generates array of 4 digit random numbers given the size as a
// parameter as shown in the method signature
// public int[] generate4DigitRandomArray(int size)
// b. Write a method to find average, min and max value of an array

import java.util.Arrays;

public class RandomValues {

    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);

        System.out.println("Generated Numbers: " + Arrays.toString(numbers));

        // Find average, min, max
        double[] result = findAverageMinMax(numbers);

        System.out.println("Average = " + result[0]);
        System.out.println("Minimum = " + (int)result[1]);
        System.out.println("Maximum = " + (int)result[2]);
    }
     public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            // Generates number between 1000 and 9999
            arr[i] = (int)(Math.random() * 9000) + 1000;
        }

        return arr;
    }

    // Method to find average, min, max
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double avg = (double) sum / numbers.length;

        return new double[]{avg, min, max};
    }

}
