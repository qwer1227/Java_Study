package array;

import java.util.Scanner;

import static java.lang.System.*;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        out.println("학생 수를 입력하세요 :");
        int stuNumber = input.nextInt();

        int[][] scores = new int[stuNumber][3];
        String[] subjects = {"국어","영어","수학"};

        // 00 01 02 = sum / 3
        // 10 11 12 = sum / 3
        // 20 21 22 = sum / 3

        for(int i=0; i<scores.length; i++){
            System.out.println(i+1+"번 학생의 성적을 입력하세요: ");
            for(int j=0; j<3; j++){
                System.out.print(subjects[j]+"점수: ");
                scores[i][j] = input.nextInt();

            }
        }
        for(int i=0; i< scores.length; i++){
            int sum = 0;
            for(int j=0; j<3; j++){
                sum = sum + scores[i][j];
            }
            double average = sum/3;
            out.println(i+1+"번 학생 총점 : "+sum);
            out.println(i+1+"번 학생 평균 : "+average);
        }

    }
}
