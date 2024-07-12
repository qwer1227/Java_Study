package access.a;

public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();


        class1.privateShow();
        class2.a = 10;

    }
}

class  DefaultClass1 {
    private int a = 10;

    public void privateShow(){
        System.out.println(a);
    }
}

class DefaultClass2 {
    int a;

    public void publicShow(){
        System.out.println(a);
    }
}
