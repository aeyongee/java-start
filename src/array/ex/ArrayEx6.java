package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0, input = 0;
        int minNum, maxNum;
        int[] array;

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        input = scanner.nextInt();
        array = new int[input];

        System.out.println(input + "개의 정수를 입력하세요:");
        for (int i = 0; i < input; i++) {
            num = scanner.nextInt();
            array[i] = num;
        }

        minNum = array[0];
        maxNum = array[0];

        for (int i = 0; i < input; i++) {
            if (maxNum < array[i]) {
                maxNum = array[i];
            }

            if (minNum > array[i]) {
                minNum = array[i];
            }
        }

        System.out.println("가장 작은 정수: " + minNum);
        System.out.println("가장 큰 정수: " + maxNum);

    }
}
