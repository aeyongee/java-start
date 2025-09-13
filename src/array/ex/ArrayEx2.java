package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("5개의 정수를 입력하세요: ");
        for (int i = 0; i < array.length; i++) {
            int num = scanner.nextInt();
            array[i] = num;
        }

        System.out.println("출력");
        for (int i = 0; i < array.length; i++) {
            if (i == 4) {
                System.out.println(array[i]);
                break;
            }

            System.out.print(array[i] + ", ");
        }
    }
}
