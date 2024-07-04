package Class;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        int a = 10;
        System.out.println("a = " + a);
        change(a);
        System.out.println("a = " + a);

        System.out.println("dataA 참조값="+ dataA); //주소값
        System.out.println("dataB 참조값="+ dataB); //주소값
        System.out.println("dataA.value = " + dataA.value); //10
        System.out.println("dataB.value = " + dataB.value); //NULL?

        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value); //20
        System.out.println("dataB.value = " + dataB.value); //null

        //dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value); //20
        System.out.println("dataB.value = " + dataB.value); //30
    }

    public static int change(int a){
        a = 20;
        return a=20;
    }

}
