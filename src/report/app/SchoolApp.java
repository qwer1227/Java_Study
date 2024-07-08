package report.app;


import report.exception.SchoolException;
import report.service.SchoolService;
import report.vo.Course;
import report.vo.Request;
import report.vo.Student;
import utils.Keyboard;

import java.util.List;

public class SchoolApp {

    private SchoolService service = new SchoolService();

    public void menu(){
        System.out.println("-----------------------------------------");
        System.out.println("1.개설과정 조회하기 2.수강신청하기 3.수강철회하기 4.수강신청내역 조회하기 5.학생 가입하기 0. 종료");
        System.out.println("-----------------------------------------");
        System.out.println();

        System.out.println("메뉴 선택");
        int menuNo = Keyboard.readInt();
        System.out.println();

        try {
            if (menuNo == 1) {
                개설과정조회하기();
            } else if (menuNo == 2) {
                수강신청하기();
            } else if (menuNo == 3) {
                수강철회하기();
            } else if (menuNo == 4) {
                수강신청내역조회하기();
            } else if (menuNo == 5) {
                학생가입하기();
            } else if (menuNo == 0) {
                종료하기();
            } else {
                System.out.println("알맞은 번호를 입력해주세요");
            }
        } catch (SchoolException e){
            System.out.println("-----------------------------------------");
            System.out.println("오류 발생 : " + e.getMessage());
            System.out.println("-----------------------------------------");
        }
        System.out.println();
        System.out.println();
        menu();
    }

    public void 개설과정조회하기(){
        System.out.println("개설과정 조회하기");
        System.out.println("---------------------------------");
        List<Course> courseList = service.viewCourse();
        for (Course course : courseList) {
            System.out.println("번호 : " + course.getNo());
            System.out.println("과정명 : " + course.getCourseName());
            System.out.println("학과 : " + course.getDept());
            System.out.println("학년 : " + course.getGrade());
            System.out.println("모집인원 : " + course.getRecruits());
            System.out.println("현재신청자수 : " + course.getCurrentApplicants());
            System.out.println();
        }
        System.out.println("---------------------------------");
    }

    public void 수강신청하기(){
        System.out.println("수강신청하기");
        System.out.println("---------------------------------");
        System.out.println("아이디를 입력해주세요");
        String id = Keyboard.readString();
        System.out.println("과정번호를 입력해주세요");
        int courseNo = Keyboard.readInt();
        service.registerCourse(id,courseNo);
        System.out.println("---------------------------------");
    }

    public void 수강철회하기(){
        System.out.println("수강신청 철회하기");
        System.out.println("---------------------------------");
        System.out.println("수강신청번호 입력해주세요");
        int requestNo = Keyboard.readInt();
        service.withdrawalCourse(requestNo);
        System.out.println("---------------------------------");
    }

    public void 수강신청내역조회하기(){
        System.out.println("수강신청내역 조회하기");
        System.out.println("---------------------------------");
        System.out.println("아이디를 입력해주세요");
        String id = Keyboard.readString();
        List<Request> request = service.viewRequest(id);
        for (Request req : request) {
            if(req.getStuId().equals(id)) {
                System.out.println("과정번호 : " + req.getCourseNumber());
                System.out.println("과정명 : " + req.getCourseName());
                System.out.println("학과 : " + req.getDept());
                System.out.println("학생아이디 : " + req.getStuId());
            }
        }
        System.out.println("---------------------------------");
    }

    public void 학생가입하기(){
        System.out.println("신규학생 가입하기");
        System.out.println("---------------------------------");
//        private String id;
//        private String name;
//        private String dept;
//        private String grade;
        System.out.println("ID를 입력해주세요");
        String id = Keyboard.readString();
        System.out.println("이름을 입력해주세요");
        String name = Keyboard.readString();
        System.out.println("학과를 입력해주세요");
        String dept = Keyboard.readString();
        System.out.println("학년을 입력해주세요");
        String grade = Keyboard.readString();

        Student student = new Student(id,name,dept,grade);

        service.registerStudent(student);


        System.out.println("---------------------------------");
    }

    public void 종료하기(){
        System.exit(1);
    }

    public static void main(String[] args) {
        SchoolApp app = new SchoolApp();
        app.menu();
    }
}
