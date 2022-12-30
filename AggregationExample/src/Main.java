import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student hrishi = new Student("Hrishi", 1, "Computer Science");
        Student ketan = new Student("Ketan", 2, "IT");
        Student bhavesh = new Student("Bhavesh", 1, "IT");
        Student Ashish = new Student("Ashish", 2, "Computer Science");
        List<Student> CS_Students = new ArrayList<Student>();

        CS_Students.add(hrishi);
        CS_Students.add(Ashish);

        List<Student> it = new ArrayList<Student>();
        it.add(ketan);
        it.add(bhavesh);

        Department cs_dept = new Department("Computer Science", CS_Students);
        Department it_dept = new Department("IT", it);

        List<Department> dept = new ArrayList<Department>();
        dept.add(cs_dept);
        dept.add(it_dept);

        Institute institute = new Institute("Mumbai", dept);

        System.out.println("Total student in institute: ");

        System.out.println(institute.getTotalStudentsInInstitute());
        System.out.println(dept.toString());
    }
}