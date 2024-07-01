package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name; // 상품명
        int price = 0; // 가격
        int count = 0; // 수량
        int result = 0; // 합계
        int option = 0; // 옵션 저장 변수

//        System.out.println("당신의 이름을 입력하세요 :");
//        String name = input.nextLine();
//        System.out.println("당신의 나이를 입력하세요 :");
//        int age = input.nextInt();
//        System.out.println("당신의 이름은 "+name+"이고,"+"나이는"+age+"입니다");

//        System.out.print("하나의 정수를 입력하세요:");
//        int number = input.nextInt();
//        if(number % 2 == 0) {
//            System.out.println("입력한 숫자 "+number+"는 짝수입니다.");
//        } else{
//            System.out.println("입력한 숫자 "+number+"는 홀수입니다.");
//        }

//        System.out.print("음식 이름을 입력해주세요:");
//        String foodName = input.nextLine();
//        System.out.print("음식 가격을 입력해주세요:");
//        int foodPrice = input.nextInt();
//        System.out.print("음식 수량을 입력해주세요:");
//        int foodQuantity = input.nextInt();
//        System.out.println(foodName + foodQuantity + "개를 주문하셨습니다" + "총 가격은 " + foodPrice * foodQuantity);


//        System.out.print("구구단 단 수를 입력해주세요:");
//        int number = input.nextInt();
//
//        for(int i = number; i <= number ; i++) {
//            for(int j = 1; j <= 9; j++){
//                System.out.println(i + "x" + j + " = " + i*j);
//            }
//        }
//        int a = 10;
//        int b = 20;
//        int temp;
//
//        temp = b;
//        b = a;
//        a = temp;
//
//        System.out.println(a);
//        System.out.println(b);

//        System.out.print("첫 번째 숫자를 입력하세요:");
//        int num1 = input.nextInt();
//        System.out.print("두 번째 숫자를 입력하세요:");
//        int num2 = input.nextInt();
//        int temp;
//
//        if(num1 > num2){
//            temp = num1;
//            num1 = num2;
//            num2 = temp;
//
//            }
//        System.out.print("두 숫자 사이의 모든 정수: ");
//        for(int i = num1; i <= num2; i++){
//            System.out.print(i+",");
//        }

//        while (true) {
//            System.out.print("이름을 입력하세요 (종료를 입력하면 종료):");
//            String name = input.nextLine();
//            if(name.equals("종료")){
//                System.out.println("프로그램을 종료합니다.");
//                break;
//            }
//            System.out.print("나이를 입력하세요 :");
//            int age = input.nextInt();
//            input.nextLine();
//            System.out.println("입력한 이름 :" + name + "," + "나이:" + age);
//        }

//        while (true) {
//            System.out.print("상품의 가격을 입력하세요 (-1을 입력하면 종료) :");
//            int price = input.nextInt();
//            if(price == -1){
//                System.out.println("프로그램을 종료합니다.");
//                break;
//            }
//            System.out.print("구매하려는 수량을 입력하세요 :");
//            int quantity = input.nextInt();
//            input.nextLine();
//            int mul = price * quantity;
//            System.out.println("총 비용 :"+mul);
//        }
//            System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요");
//        while(true){
//            number = input.nextInt();
//
//            if(number == -1) {
//                break;
//            }
//            sum = sum + number;
//            count++;
//        }
//        double avg = (double)sum/count;
//        System.out.println("입력한 숫자들의 합계 : " + sum);
//        System.out.println("입력한 숫자들의 평균 : " + avg);

        while (true){
            System.out.println("1 : 상품 입력, 2 : 결제, 3 : 프로그램 종료");
            option = input.nextInt();
            if(option == 1){
                System.out.print("상품명을 입력하세요:");
                name = input.nextLine();
                input.nextLine();
                System.out.print("상품의 가격을 입력하세요");
                price = input.nextInt();
                System.out.print("상품의 수량을 입력하세요");
                count = input.nextInt();
            }
            else if(option == 2){
                result = price * count;
                System.out.println("총 금액은 : "+result);
                result = 0;
            } else if(option == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            } else{
                System.out.println("올바른 옵션을 선택해주세요");
            }


        }






    }
}
