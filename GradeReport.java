import java.util.Date;

/**
 * A class representing a grade report for a student in a course.
 */
public class GradeReport {
    private Course course;
    private Student student;
    private int studentGrade;
    private Date date;

    /**
     * Constructs a grade report for the given course, student, and grade.
     *
     * @param course       the course for which the grade is reported
     * @param student      the student for whom the grade is reported
     * @param studentGrade the grade obtained by the student
     */
    public GradeReport(Course course, Student student, int studentGrade) {
        this.course = course;
        this.student = student;
        this.studentGrade = studentGrade;
        date = new Date();
    }

    /**
     * Returns the course associated with this grade report.
     *
     * @return the course
     */
    public Course getCourse() {
        return course;
    }

    /**
     * Returns the student associated with this grade report.
     *
     * @return the student
     */
    public Student getStudent() {
        return student;
    }

    /**
     * Returns the grade obtained by the student.
     *
     * @return the student's grade
     */
    public int getStudetnGrade() {
        return studentGrade;
    }

    /**
     * Returns the date when the grade report was created.
     *
     * @return the date of the grade report
     */
    public Date getDate() {
        return date;
    }
}