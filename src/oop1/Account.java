package oop1;

public class Account {
    int balance; //필드


    //입금 기능
    int deposit(int amount){
        balance = balance + amount;
        return balance;
    }


    //출금 기능
    int withdraw(int amount){
        if(balance < amount){
            System.out.println("잔액 부족입니다");
        } else{
            balance = balance - amount;
        }





        return balance;
    }
}
