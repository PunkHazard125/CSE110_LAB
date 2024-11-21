import java.util.*;

public class Home_Task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Course> course_list = new ArrayList<>();

        System.out.print("\nAdding a course\n\n");

        System.out.print("Enter course name: ");
        Course course_1 = new Course(scanner.nextLine());

        System.out.print("\nAssigning a Faculty to this course\n\n");

        System.out.print("Enter faculty name: ");
        String fac_name = scanner.nextLine();
        System.out.print("Enter faculty ID: ");
        int fac_ID = scanner.nextInt();
        scanner.nextLine();

        Faculty faculty_1 = new Faculty(fac_name, fac_ID);

        faculty_1.set_course(course_1);

        System.out.println("\nFaculty added to the course successfully!");

        System.out.println("\nStudent Panel\n");

        System.out.print("Enter student name: ");
        String stu_name = scanner.nextLine();
        System.out.print("Enter student ID: ");
        int stu_ID = scanner.nextInt();
        scanner.nextLine();

        Student student_1 = new Student(stu_name, stu_ID);

        student_1.add_course(course_1);

        System.out.println("\nCourse added to the student successfully!");

        course_list.add(course_1);
        System.out.println("\nCourse added to the course list successfully!\n");

        scanner.close();

    }

}

class Student {

    private String name;
    private int ID;
    private ArrayList<Course> courses;

    public Student(String name, int ID) {

        this.name = name;
        this.ID = ID;
        this.courses = new ArrayList<>();

    }

    public String get_name() {

        return this.name;

    }

    public int get_ID() {

        return this.ID;

    }

    public void set_name(String name) {

        this.name = name;

    }

    public void set_ID(int ID) {

        this.ID = ID;

    }

    public void add_course(Course course) {

        if (!courses.contains(course))
        {
            this.courses.add(course);
            course.add_student(this);

        }
    }

}

class Course {

    private String name;
    private Faculty faculty;
    private ArrayList<Student> students;

    public Course(String name) {

        this.name = name;
        this.students = new ArrayList<>();

    }

    public String get_name() {

        return this.name;

    }

    public Faculty get_faculty() {

        return this.faculty;

    }

    public void add_student(Student student) {

        if (!students.contains(student))
        {
            this.students.add(student);
            student.add_course(this);
        }

    }

    public void set_name(String name) {

        this.name = name;

    }

    public void set_faculty(Faculty faculty) {

        if (this.faculty != faculty)
        {
            this.faculty = faculty;
            faculty.set_course(this);
        }

    }

}

class Faculty {

    private String name;
    private int ID;
    private Course course;

    public Faculty(String name, int ID) {

        this.name = name;
        this.ID = ID;

    }

    public String get_name() {

        return this.name;

    }

    public int get_ID() {

        return this.ID;

    }

    public Course get_course() {

        return this.course;

    }

    public void set_name(String name) {

        this.name = name;

    }

    public void set_ID(int ID) {

        this.ID = ID;

    }

    public void set_course(Course course) {

        if (this.course != course)
        {
            this.course = course;
            course.set_faculty(this);
        }

    }

}
