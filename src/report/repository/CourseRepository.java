package report.repository;


import report.exception.SchoolException;
import report.vo.Course;
import report.vo.Request;

import java.util.ArrayList;
import java.util.List;

public class CourseRepository {
    private List<Course> courses = new ArrayList<>();
    private int sequence = 1000;

    public CourseRepository(){
        courses.add(new Course(sequence++,"C프로그래밍","컴퓨터공학","3",5,0));
        courses.add(new Course(sequence++,"전자전기","디지털전자","3",5,0));
        courses.add(new Course(sequence++,"산업디자인의이해","산업디자인","3",5,0));
    }

    public List<Course> getCourses() {
        return courses;
    }

    public Course findCourseByNumber(int number){
        Course course = null;
        for(Course c : courses){
            if(c.getNo()==number){
                course = c;
                return course;
            }
        }
        throw new SchoolException("해당하는 과정번호가 없습니다");
    }

}
