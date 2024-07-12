package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public 호출 가능
        data.publicField =1;
        data.publicMethod();

        //같은 패키지 default호출 가능
        data.defaultField = 1;
        data.defaultMethod();

        //private 호출 불가


        //기능이 public으로 열려있는 경우 그 메소드를 통해서 조회와 값을 수정을 가능하다
        data.privateInfo();

        data.innerAccess();
    }
}
