import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "Вячеслав";
        System.out.println("Введите имя ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        if (Objects.equals(text, name)) {
            System.out.println("Привет, " + text);
        } else {
            System.out.println("Нет такого имени");
        }

        int seven = 7;
        System.out.println("Введите число ");
        Scanner scanner1 = new Scanner(System.in);
        int num = scanner1.nextByte();
        if (num > seven) {
            System.out.println("Привет");
        }

        System.out.println("Введите длину числового массива ");
        Scanner scanner2 = new Scanner(System.in);
        int len = scanner2.nextInt();
        int[] numberArray = new int[len];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < len; i++) {
            numberArray[i] = scanner2.nextInt();
        }
        System.out.println("Числовой массив: " + Arrays.toString(numberArray));
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] % 3 == 0) {
                System.out.println("Элемент массива кратный '3' : " + numberArray[i]);
            }
        }
    }
}