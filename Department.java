import java.util.List;
import java.util.ArrayList;

/**
 * A class representing a department.
 */
public class Department {
    private String departmentName;
    private String departmentHead;
    private List<Course> courses;

    /**
     * Constructs a department with the specified department name and department head.
     *
     * @param departmentName the name of the department
     * @param departmentHead the head of the department
     */
    public Department(String departmentName, String departmentHead) {
        this.departmentName = departmentName;
        this.departmentHead = departmentHead;
        courses = new ArrayList<>();
    }

    /**
     * Returns the name of the department.
     *
     * @return the department name
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * Returns the head of the department.
     *
     * @return the department head
     */
    public String getDepartmentHead() {
        return departmentHead;
    }

     /**
     * Returns the list of courses offered by the department.
     *
     * @return the list of courses
     */
    public List<Course> getCourses() {
        return courses;
    }

    /**
     * Adds a course to the department's course list.
     *
     * @param course the course to add
     */
    public void addCourse(Course course) {
        courses.add(course);
    }

    /**
     * Removes a course from the department's course list.
     *
     * @param course the course to remove
     */
    public void removeCourse(Course course) {
        courses.remove(course);
    }

    /**
     * Prints a report of all the courses offered by the department.
     */
    public void reportCurses() {
        for (Course x : courses) {
            System.out.printf("Course name: %s\n,Course code: %s\n", x.getCourseName(), x.getCourseCode());
        }
    }
}
    
