import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
 * A class representing a student, inheriting from the Person class.
 */
public class Student extends Person {
    private int grade;
    private String major;
    private Date date;

    /**
     * Constructs a student with the specified name, address, email, grade, and major.
     *
     * @param name    the name of the student
     * @param address the address of the student
     * @param email   the email of the student
     * @param grade   the grade of the student
     * @param major   the major of the student
     */
    public Student(String name, String address, String email, int grade, String major) {
        super(name, address, email);
        date = new Date();
        this.grade = grade;
        this.major = major;
    }

    /**
     * Returns the grade of the student.
     *
     * @return the grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * Returns the major of the student.
     *
     * @return the major
     */
    public String getMajor() {
        return major;
    }

     /**
     * Returns the date when the student was created.
     *
     * @return the creation date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Calculates and returns the grade point average (GPA) of the student based on the provided grade reports.
     * If the list is empty, returns 0.
     *
     * @param gradeReports the list of grade reports
     * @return the grade point average
     */
    public int gradePointAverage(List<GradeReport> gradeReports) {
        if (gradeReports.isEmpty()) {
            return 0;
        }
        int result = 0;
        for (GradeReport report : gradeReports) {
            result += report.getStudetnGrade();
        }
        return result / gradeReports.size();
    }
}