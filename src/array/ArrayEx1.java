package array;

import java.util.Scanner;

public class ArrayEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int count = 0;
        int total = 0;
        double avg = 0;

        int temp = 0;

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        count = input.nextInt();
        int[] numbers = new int[count];

        System.out.println(count+"개의 정수를 입력하세요:");
        for(int i=0; i<count; i++) {
            numbers[i] = input.nextInt();


        }

        int max = numbers[0];
        int min = numbers[0];
        for(int i=0; i<count; i++) {
            max = numbers[i] > max ? numbers[i] : max;
            min = numbers[i] < min ? numbers[i] : min;
        }
        System.out.println("가장 작은 정수 : " + min);
        System.out.println("가장 큰 정수 : " + max);
    }
}
