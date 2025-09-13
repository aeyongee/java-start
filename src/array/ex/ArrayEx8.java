package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] scores;
        int student = 0;
        String[] subjects = {"국어", "영어", "수학"};

        System.out.print("학생수를 입력하세요:");
        student = scanner.nextInt();

        scores = new int[student][subjects.length];

        for (int i = 0; i < student; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j] + " 점수:");
                scores[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < student; i++) {
            int sum = 0;

            for (int j = 0; j < 3; j++) {
                sum += scores[i][j];
            }
            double average = (double) sum / 3;

            System.out.println((i + 1) + "번 학생의 총점: " + sum + ", 평균: " + average);
        }
    }
}
