package Class;

public class ClassEx {
    public static void main(String[] args) {
        //Student객체를 만들어서 참조변수 student1에 객체의 주소를 저장
        Student student1 = new Student();
        //참조변수 student2에 student1의 주소값을 저장
        Student student2 = student1;
        //객체에 주소를 이용해 .(닷)으로 접근?해서 이름 값을 저장
        student1.name = "정성민";

        //student2는 student1의 주소값을 가리키고 있어서 값은 똑같다고 생각
        System.out.println(student1.name);
        System.out.println(student2.name);

    }
}
