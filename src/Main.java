import java.util.Arrays;

public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("задача 1");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int sum = 0;

        for (int elm : arr) {
            sum += elm;
        }
        System.out.println("траты за месяц составила "  + sum +   " рублей");

        System.out.println("Задача 2");
        int min = arr [0];
        int max = arr [0];

        for (int i=0;i<arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println("Минимальная сума трат за день составила "  + max + " рублей");
        System.out.println("Максимальная сумма трат за день составила "  + min + " рублей");

        System.out.println("задача 3");
        System.out.println("средняя сумма трат за месяц составила " +sum/arr.length + " рублей");

        System.out.println("задача 4");
        char [] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for(int i=reverseFullName.length -1;i>=0;i--)
            System.out.println(reverseFullName[i]);

    }

}