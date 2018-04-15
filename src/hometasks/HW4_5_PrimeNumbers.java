// Напишите программу, которая вычислит простые числа в пределах от 2 до 100.
// (Опционально) Дополните программу так, чтобы она вычисляла составные числа.

package hometasks;

public class HW4_5_PrimeNumbers {

    public static void getPrimeNumbers(int max) {

        int count;
        for (int i = 2; i <= max; i++) {
            count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    count++;
                }
            }
            if(count == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void getCompositeNumbers(int max){
        int count;
        for (int i = 2; i <= max; i++) {
            count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    count++;
                }
            }
            if(count > 0){
                System.out.print(i + " ");
            }
        }
    }


    public static void main(String[] args) {
        HW4_5_PrimeNumbers.getPrimeNumbers(100);
        System.out.println();
        HW4_5_PrimeNumbers.getCompositeNumbers(100);
    }
}
