class Person{
    protected String name;
    protected int age;
    protected String gender;

    public void readDetails(String n,int a,String g){
        name = n;
        age =a;
        gender = g;
    }
    public void displayDetails(){
        System.out.println(
            "Name: " + name +
            ", Age: " + age +
            ", Gender: " + gender
        );
    }
}
class Student extends Person{
    private String studentId;
    private String course;

    public void readStudentDetails(String name, int age, String gender, String si, String c){
        readDetails(name ,age, gender);
        studentId = si;
        course = c;
    }
    public void displayStudnetDetails(){
        displayDetails();
         System.out.println(
            "Student ID: " + studentId +
            ", Course: " + course
        );
        System.out.println("----------------------------------");
    }

}

class Employee extends Person{
    private String empId;
    private double salary;
    public void readEmployeeDetails(String name, int age, String gender,String empId, double salary){
        readDetails(name, age, gender);
        this.empId = empId;
        this.salary = salary;
    }
    public void displayEmployeeDetails(){
        displayDetails();
        System.out.println(
            "Employee ID: " + empId +
            ", Salary: " + salary
        );
        System.out.println("----------------------------------");
    }
}

public class p4{
    public static void main(String[] args){
        Student[] students = new Student[5];
        students[0] = new Student();
        students[0].readStudentDetails("Alice", 20, "Female", "S101", "B.Sc CS");

        students[1] = new Student();
        students[1].readStudentDetails("Bob", 21, "Male", "S102", "B.Tech IT");

        students[2] = new Student();
        students[2].readStudentDetails("Carol", 22, "Female", "S103", "BCA");

        students[3] = new Student();
        students[3].readStudentDetails("David", 20, "Male", "S104", "B.Sc Maths");

        students[4] = new Student();
        students[4].readStudentDetails("Eve", 19, "Female", "S105", "BBA");
        System.out.println("---Student Details---\n");
        for(Student s:students){
            s.displayStudnetDetails();
        }
        Employee[] employees = new Employee[5];

        employees[0] = new Employee();
        employees[0].readEmployeeDetails("John", 30, "Male", "E201", 55000);

        employees[1] = new Employee();
        employees[1].readEmployeeDetails("Sarah", 28, "Female", "E202", 60000);

        employees[2] = new Employee();
        employees[2].readEmployeeDetails("Mike", 35, "Male", "E203", 70000);

        employees[3] = new Employee();
        employees[3].readEmployeeDetails("Linda", 32, "Female", "E204", 65000);

        employees[4] = new Employee();
        employees[4].readEmployeeDetails("Tom", 29, "Male", "E205", 58000);
        System.out.println("---Employee Details---\n");
        for( Employee e:employees){
            e.displayEmployeeDetails();
        }
    }
}