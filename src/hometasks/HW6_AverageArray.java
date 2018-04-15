// Найдите среднее арифметическое массива из 10 элементов типа double.

package hometasks;

import java.util.Arrays;

public class HW6_AverageArray {

    public static double getAvgInArray(double[] array) {
        double sum = 0;
        for (double i : array) {
            sum += i;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        double[] myArray = {10, 12, 17, 5, 2, 4, 5, 12, 6, 3};
        System.out.println(Arrays.toString(myArray));
        System.out.println("Average value of array is " + getAvgInArray(myArray));
    }
}
