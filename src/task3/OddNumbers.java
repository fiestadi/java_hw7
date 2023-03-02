package task3;

public class OddNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 20; i <= 60; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Сумма нечетных чисел от 20 до 60: " + sum);
    }
}
