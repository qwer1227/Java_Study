package report.repository;

import demo7.exception.MallException;
import report.exception.SchoolException;
import report.vo.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private List<Student> students = new ArrayList<Student>();

    public StudentRepository() {
        students.add(new Student("hong","홍길동","컴퓨터공학","3"));
        students.add(new Student("kim","김유신","디지털전자","2"));
        students.add(new Student("kang","강감찬","산업디자인","1"));
    }

    public Student findStudentById(String id) {
        Student student = null;
        for (Student s : students) {
            if (s.getId().equals(id)) {
                student = s;
                return student;
            }
        }
        throw new SchoolException("해당하는 아이디가 없습니다");
    }

    public void findStudentId(String id){
        for (Student s : students) {
            if (s.getId().equals(id)) {
                throw new SchoolException("입력하신 ID와 동일한 회원이 있습니다");
            }
        }
    }


    public void insertStudent(Student student) {
        students.add(student);
        System.out.println("회원가입 성공");
    }
}
