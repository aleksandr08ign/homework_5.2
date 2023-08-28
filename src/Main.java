import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1.");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int a = 0; a < arr.length; a++) {
            sum += arr[a];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2.");
        int[] arr = generateRandomArray();
        int max = 200_000;
        for (int b = 0; b < arr.length; b++) {
            if (arr[b] > max) ;
            {
                max = arr[b];
            }
        }
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей." + " Максимальная сумма трат за день составила " + max + "рублей.");
    }

    public static void task3() {
        System.out.println("Задача 3.");
        int[] arr = generateRandomArray();
        double average = 0;
        double summa = 0;
        int n = arr.length;
        for (int d = 0; d < n; d++) {
            summa += arr[d];
        }
        average = summa / n;

        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
    }

    public static void task4() {
        System.out.println("Задача 4.");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int x = reverseFullName.length - 1; x >= 0; x--) {
            System.out.print(reverseFullName[x]);
        }
        }
    }
