import java.util.*;

public class Problem_1 {

    public static void main(String[] args) {
        
        Manager manager = new Manager();

        manager.name = "Bob";
        manager.age = 45;
        manager.phone = "12345";
        manager.address = "Chicago";
        manager.salary = 500.00;

        Employee employee = new Employee();

        employee.name = "Jack";
        employee.age = 25;
        employee.phone = "56789";
        employee.address = "New York";
        employee.salary = 250.00;

        manager.printSalary();
        employee.printSalary();

    }

}

class Member {

    public String name;
    public int age;
    public String phone;
    public String address;
    public double salary;

    public Member() {

    }

    public Member(String name) {

        this.name = name;

    }    

    public void printSalary() {

        System.out.printf("Salary of member is: %.2f\n", this.salary);

    }

}

class Manager extends Member {

    private String spec;

    public Manager() {

    }

    public String getSpec() {

        return this.spec;

    }

    public void setSpec(String spec) {

        this.spec = spec;

    }

}

class Employee extends Member {

    private String dept;

    public Employee() {

    }

    public String getDept() {

        return this.dept;

    }

    public void setSpec(String dept) {

        this.dept = dept;

    }

}
