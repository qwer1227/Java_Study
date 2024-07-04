package report.vo;

public class Request {
    private int no;
    private int courseNumber;
    private String courseName;
    private String dept;
    private String stuId;
    private boolean withdrawal;

    public Request() {

    }

    public Request(int no, int courseNumber, String courseName, String dept, String stuId, boolean withdrawal) {
        this.no = no;
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.dept = dept;
        this.stuId = stuId;
        this.withdrawal = withdrawal;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
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

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public boolean isWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(boolean withdrawal) {
        this.withdrawal = withdrawal;
    }
}
