package Class;

public class MethodChange {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: data.value = " + dataA.value);
        changeRef(dataA);
        System.out.println("메서드 호출 후: data.value = " + dataA.value);
    }

    public static void changeRef(Data dataX){
        dataX.value = 20;
    }
}
