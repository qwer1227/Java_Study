package method;

import java.util.Scanner;

public class MethodEx1 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int balance = 0;
        int depositAmount = 0;
        int withdrawAmount = 0;
        while(true){
            System.out.println("---------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------");
            int option = input.nextInt();
            if(option == 1){
                System.out.println("선택 :"+option);
                System.out.print("입금액을 입력하세요: ");
                depositAmount = input.nextInt();
                balance = deposit(balance, depositAmount);
            }
            else if(option == 2){
                System.out.println("선택 :"+option);
                System.out.print("출금액을 입력하세요: ");
                withdrawAmount = input.nextInt();
                balance = withdraw(balance,withdrawAmount);
            }
            else if(option == 3){
                System.out.println("선택 :"+option);
                System.out.println("현재 잔액 :"+balance+"원");
            } 
            else if (option == 4) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
            else {
                System.out.print("알맞은 번호를 입력해주세요");
            }

        }

    }
    public static int deposit(int balance , int depositAmount){
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하셨습니다. 현재 잔액 : " + balance + "원");
        return balance;
    }
    public static int withdraw(int balance , int withdrawAmount){
        if(balance >= withdrawAmount){
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액 : " + balance + "원");
        } else{
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다");
        }
        return balance;
    }
}
