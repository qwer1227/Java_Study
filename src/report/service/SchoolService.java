package report.service;

import report.exception.SchoolException;
import report.repository.CourseRepository;
import report.repository.RequestRepository;
import report.repository.StudentRepository;
import report.vo.Course;
import report.vo.Request;
import report.vo.Student;

import java.util.List;

public class SchoolService {
    private StudentRepository studentRepository = new StudentRepository();
    private CourseRepository courseRepository = new CourseRepository();
    private RequestRepository requestRepository = new RequestRepository();

    public List<Course> viewCourse(){
        List<Course> courses = null;
        courses = courseRepository.getCourses();
        return courses;
    }

    public void registerCourse(String stuId, int courseNo){
        Course course = courseRepository.findCourseByNumber(courseNo);
        Student student = studentRepository.findStudentById(stuId);

        //- 학생아이디로 레포지토리(StudentRepository)에서 학생정보를 조회한다. 학생정보가 null 이면 예외발생
        if(student == null){
            throw new SchoolException("입력하신 ID에 해당하는 학생정보가 없습니다");
        }
        //- 과정번호로 레포지토리(CourseRepository)에서 과정정보를 조회한다. 과정정보가 null이면 예외발생
        if(course == null){
            throw new SchoolException("입력하신 과정번호에 해당하는 과정이 없습니다");
        }
        //- 조회된 과정정보에서 모집인원과 신청자수가 동일하면 모집마감된 과정이다.  예외발생
        if(course.getRecruits() == course.getCurrentApplicants()){
            throw new SchoolException("모집 마감된 과정입니다.");
        }
        
        //- 수강신청정보를 저장하는 객체
        Request request = new Request();
        //- 수강신청정보를 저장하는 객체를 생성하고,  과정번호, 과정명, 학과, 학생아이디를 저장한다.
        request.setCourseNumber(course.getNo());
        request.setCourseName(course.getCourseName());
        request.setDept(course.getDept());
        request.setStuId(student.getId());

        //- 레포지토리(CourseRepository)에 수강신청정보를 전달해서 저장시킨다.
        requestRepository.saveRequest(request);

        //- 과정정보에서 신청자수를 1증가시킨다.
        course.setCurrentApplicants(course.getCurrentApplicants() + 1);

    }

    public List<Request> viewRequest(String stuId){
        List<Request> requests = null;
        requests = requestRepository.getRequests(stuId);
        Student student = studentRepository.findStudentById(stuId);
        for (Request request : requests) {
            if(request.getStuId().equals(student.getId())){
                return requests;
            }
        }
        throw new SchoolException("입력하신 아이디에 해당하는 수강신청내역이 없습니다");
    }


}
