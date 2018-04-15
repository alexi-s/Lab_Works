// Напишите метод, который будет увеличивать заданный элемент массива на 10%.

package hometasks;

import java.util.Arrays;

public class HW2_ArrayUtils {

    private static int MULT_VALUE = 10; // in percents

    public static float[] multElementOfArray(float[] array, int element) {
        array[element] += array[element] * MULT_VALUE / 100;
        return array;
    }

    public static void main(String[] args) {
        float[] myArray = {2, 6, 13, 6, 7, 3, 9};
        System.out.println(Arrays.toString(myArray));
        HW2_ArrayUtils.multElementOfArray(myArray, 4);
        System.out.println(Arrays.toString(myArray));
    }
}
