package Class;

public class VarChange {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        System.out.println(a); //10
        System.out.println(b); //10

        a = 20;
        System.out.println(a); //20
        System.out.println(b); //10

        b = 30;
        System.out.println(a); // 20
        System.out.println(b); // 30
    }
}
