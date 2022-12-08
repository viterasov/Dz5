import java.util.Arrays;
import java.util.stream.IntStream;

public class Main { // Задание 1
    public static int[] generateRandomArray() { // внутри класса Main, но не внутри метода main()
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) { // метод main
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));

        int sum = 0;

        for (int elem : arr) {
            sum = sum + elem;
        }
        System.out.println(" Сумма трат за месяц составила " + (sum) + " рублей");

        // Задание 2
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }

        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println(" Средняя сумма трат за месяц составила " + (sum / 30) + " рублей");

        // Задание 4

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char[] n = reverseFullName;
        int i = n.length - 1, j = 0;
        char[] let = new char[n.length];
        while (i >= 0) {
            let[j] = n[i];
            i--;
            j++;
        }
        for (char c : let) {
            System.out.print(c);
        }
    }


}


