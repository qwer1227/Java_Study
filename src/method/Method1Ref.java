package method;

public class Method1Ref {
    public static void main(String[] args) {
        int sum1 = add(5,6);
        System.out.println("결과1 출력 : "+sum1);

        double sum2 = avg(5,6);
        System.out.println("결과2 출력 : "+sum2);
    }

    public static int add(int a, int b) {
        System.out.println(a + "+" + b + "연산수행");
        int sum = a + b;
        return sum;
    }

    public static double avg(int a, int b) {
        double sum = (double) a + b;
        return sum / 2;
    }
}
