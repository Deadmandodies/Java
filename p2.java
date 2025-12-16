import java.util.*;

class Employee{
    String name,department,designation;
    int age,Emp_id;
    double salary;


    Employee(String n,int i , String d,int a,String g,double s){
        name = n;
        Emp_id = i;
        department = d;
        age = a;
        designation = g;
        salary = s;
    }
    void printDetails(){
        System.out.println("ID:" + Emp_id+"\nName:"+name+"\nDepartment:"+department+"\nAge:"+age+"\nDesignation:"+designation+"\nSalary:"+salary);

    }
}

public class p2{
    public static void main(String[] args){
        ArrayList<Employee> e  = new ArrayList<>();
        e.add(new Employee("John",101,"Sales",30,"Manager",50000));
        e.add(new Employee("Kailash",102,"Purchase",22,"AsstManager",60000));
        e.add(new Employee("Ishan",103,"Sales",25,"Executive",45000));
        e.add(new Employee("Joe",104,"HR",35,"Manager",55000));
        e.add(new Employee("Aadarsh",105,"Purchase",28,"Manager",70000));

        for( Employee emp: e){
            emp.printDetails();
        }
        double totsal=0;

        for (Employee x:e){
            if(x.department.equals("Sales")){
                totsal += x.salary;
            }
        }
        System.out.println("Sales Total Salary :"+totsal);

        Employee hpm = null;
        for(Employee x:e){
            if(x.designation.equals("Manager") || x.department.equals("Purchase")){
                if(hpm==null || x.salary > hpm.salary){
                    hpm = x;
                }
            }
        }
        if(hpm!=null) {
            System.out.println("Highest Paid Manager:");
            hpm.printDetails();

        for(Employee x : e)
            if(x.department.equals("Purchase") && x.age == 28)
                x.printDetails();

    }
}
}