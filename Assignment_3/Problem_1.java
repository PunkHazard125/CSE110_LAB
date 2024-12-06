import java.util.*;

public class Problem_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Person p1 = new Person();
        Student s1 = new Student("Junior");
        Employee e1 = new Employee();
        Faculty f1 = new Faculty();
        Staff sf1 = new Staff();

        p1.setName("Jack");
        s1.setName("Jacob");
        e1.setName("David");
        f1.setName("Jonathan");
        sf1.setName("Eric");

        System.out.println(p1.toString());
        System.out.println();

        System.out.println(s1.toString());
        System.out.println();

        System.out.println(e1.toString());
        System.out.println();

        System.out.println(f1.toString());
        System.out.println();

        System.out.println(sf1.toString());
        System.out.println();
        
        scanner.close();
        
    }
    
}

class Person {

    private String name;
    private String phone;
    private String address;
    private String email;

    public Person() {}

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public String getPhone() {

        return phone;

    }

    public void setPhone(String phone) {

        this.phone = phone;

    }

    public String getAddress() {

        return address;

    }

    public void setAddress(String address) {

        this.address = address;

    }

    public String getEmail() {

        return email;

    }

    public void setEmail(String email) {

        this.email = email;

    }


    @Override
    public String toString() {

        return "Name: " + this.getName();

    }

}

class Student extends Person {

    private final String year;

    public Student(String year) {

        this.year = year;

    }

    public String getYear() {

        return this.year;

    }

    @Override
    public String toString() {

        return super.toString() + "\nThis person is a student";

    }

}

class Employee extends Person {

    private String office;
    private double salary;
    private Date dateHired;

    public Employee() {

        this.dateHired = new Date();

    }

    public String getOffice() {

        return this.office;

    }

    public void setOffice(String str) {

        this.office = str;

    }

    public double getSalary() {

        return this.salary;

    }

    public void setSalary(double value) {

        this.salary = value;

    }

    public Date getDateHired() {

        return this.dateHired;

    }

    @Override
    public String toString() {

        return super.toString() + "\nThis person is an employee";

    }

}

class Faculty extends Employee {

    private String officeHours;
    private String rank;

    public Faculty() {}

    public String getOfficeHours() {

        return this.officeHours;

    }

    public void setOfficeHours(String str) {

        this.officeHours = str;

    }

    public String getRank() {

        return this.rank;

    }

    public void setRank(String str) {

        this.rank = str;

    }

    @Override
    public String toString() {

        return super.toString() + "\nThis person is one of the faculty members";

    }

}

class Staff extends Employee {

    private String title;

    public Staff() {}

    public Staff(String title) {

        this.title = title;

    }

    public String getTitle() {

        return this.title;

    }

    public void setTitle(String str) {

        this.title = str;

    }

    @Override
    public String toString() {

        return super.toString() + "\nThis person is one of the staff";

    }

}
