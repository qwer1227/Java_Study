package method;

public class Method2 {
    public static void main(String[] args) {

        int number = 5;
        System.out.println("1. changeNumber 호출 전, number: "+ number); //5
        number = changeNumber(number);
        System.out.println("4. changeNumber 호출 후, number: "+ number); //10
    }

//    public static boolean checkAge (int age) {
//        if (age > 18) {
//            System.out.println("입장하세요");
//            return true;
//        } else{
//            System.out.println("미성년자는 출입이 불가합니다.");
//            return false;
//        }
//    }

    public static int changeNumber (int number) {
        System.out.println("2. changeNumber 변경 전, number:" + number); //5
        number = number * 2;
        System.out.println("3. changeNumber 변경 후, number:" + number); //10
        return number;
    }
}
