import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Gor", "Hrazdan", "gordavtyan@gmail.com", 9, "PRogramming");
        Student student2 = new Student("Poxos", "Erevan", "poxos@mail.ru", 8, "mathematics");
   
        Teacher teacher = new Teacher("Petrosyan", "Erevan", "petr@gmail.com", "Math", 250000);
   
        Course course = new Course("Programming", "PA_105", teacher);

        course.addSdutents(student1);
        course.addSdutents(student2);

        Classroom classroom = new Classroom("AL 15", 15);

        System.out.println("Can the course use the classroom? - " + classroom.isCheckClassroom(course));

        Department department = new Department("Picsart", "Vardan");
        department.addCourse(course);

        GradeReport gradeReport1 = new GradeReport(course, student1, 81);
        GradeReport gradeReport2 = new GradeReport(course, student1, 91);


        teacher.assignGrades(course, student1, 91);


        List<GradeReport> gradeReports = new ArrayList<>();
        gradeReports.add(gradeReport1);
        gradeReports.add(gradeReport2);
        System.out.println(student1.gradePointAverage(gradeReports));
    }
}