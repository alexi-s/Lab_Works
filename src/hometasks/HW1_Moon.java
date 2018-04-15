// Сила тяжести на Луне примерно равна 17%, напишите программу, которая вычисляет ваш вес на Луне.

package hometasks;

import java.util.Scanner;

public class HW1_Moon {

    private static float MOON_GRAVITY = 0.17f;

    public static float getWeight(float mass) {
        return MOON_GRAVITY * mass;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your weight: ");
        float mass = scan.nextFloat();
        System.out.println("Your weight on HW1_Moon is " + HW1_Moon.getWeight(mass));
    }

}
