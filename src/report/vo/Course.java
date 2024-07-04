package report.vo;

public class Course {
    //번호, 과정명, 학과, 학년, 모집인원, 현재신청자수
    private int no;
    private String courseName;
    private String dept;
    private String grade;
    private int recruits;
    private int currentApplicants;

    public Course() {

    }

    public Course(int no, String courseName, String dept, String grade, int recruits, int currentApplicants) {
        this.no = no;
        this.courseName = courseName;
        this.dept = dept;
        this.grade = grade;
        this.recruits = recruits;
        this.currentApplicants = currentApplicants;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getRecruits() {
        return recruits;
    }

    public void setRecruits(int recruits) {
        this.recruits = recruits;
    }

    public int getCurrentApplicants() {
        return currentApplicants;
    }

    public void setCurrentApplicants(int currentApplicants) {
        this.currentApplicants = currentApplicants;
    }
}

