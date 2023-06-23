import java.util.List;
import java.util.ArrayList;

/**
 * A class representing a teacher, inheriting from the Person class.
 */
public class Teacher extends Person {
    private String subject;
    private double salary;

     /**
     * Constructs a teacher with the specified name, address, email, subject, and salary.
     *
     * @param name    the name of the teacher
     * @param address the address of the teacher
     * @param email   the email of the teacher
     * @param subject the subject taught by the teacher
     * @param salary  the salary of the teacher
     */
    public Teacher (String name, String address, String email, String subject,double salary) {
        super(name, address, email);
        this.subject = subject;
        this.salary = salary;
    }

    /**
     * Returns the salary of the teacher.
     *
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Returns the subject taught by the teacher.
     *
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }
    
     /**
     * Assigns grades to a student for a specific course.
     *
     * @param course       the course for which the grades are assigned
     * @param student      the student to whom the grades are assigned
     * @param studentGrade the grade to assign
     */
    public void assignGrades(Course course, Student student, int studentGrade) {
        GradeReport gradeReport = new GradeReport(course, student, studentGrade);
    } 
}