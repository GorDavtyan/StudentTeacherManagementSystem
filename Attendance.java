import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 * A class representing attendance for a course on a specific date.
 */
public class Attendance {
    private Date date;
    private Course course;
    private List<Student> students;

    /**
     * Constructs a new Attendance object with the current date and an empty list of students.
     */
    public Attendance() {
        date = new Date();
        students = new ArrayList<>();
    }

    /**
     * Returns the date of the attendance.
     *
     * @return the date of the attendance
     */
    public Date getDate() {
        return date;
    }

     /**
     * Returns the course associated with the attendance.
     *
     * @return the course
     */
    public Course getCourse() {
        return course;
    }

    /**
     * Returns the list of students present in the attendance.
     *
     * @return the list of students
     */
    public List<Student> getStusdents() {
        return students;
    }

}