import java.util.List;
import java.util.ArrayList;

/**
 * A class representing a course.
 */
public class Course {
    private String courseName;
    private String courseCode;
    private Teacher teacher;
    private List<Student> students;

    /**
     * Constructs a course with the specified course name, course code, and teacher.
     *
     * @param courseName the name of the course
     * @param courseCode the code of the course
     * @param teacher    the teacher of the course
     */
    public Course(String courseName, String courseCode, Teacher teacher) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.teacher = teacher;
        students = new ArrayList<>();
    }

    /**
     * Returns the name of the course.
     *
     * @return the course name
     */
    public String getCourseName() {
        return courseName;
    }

     /**
     * Returns the code of the course.
     *
     * @return the course code
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * Returns the teacher of the course.
     *
     * @return the teacher
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Returns the list of students enrolled in the course.
     *
     * @return the list of students
     */
    public void addSdutents(Student student) {
        students.add(student);
    }

    /**
     * Adds a student to the course.
     *
     * @param student the student to add
     */
    public void removeStudent(Student student) {
        students.remove(student);
    }
} 