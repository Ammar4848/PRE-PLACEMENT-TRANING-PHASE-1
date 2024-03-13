import java.util.*;
public class Employee {
    static int eno,esal;
    static String ename,city;
    public Employee(int sal){
        esal = sal;
    }
    public void work(){
        System.out.println("I am Currently doing Devlopment Work");
    }
    public void getSalary(){
        System.out.println("Your Salary is"+esal);
    }
    public void addEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name = ");
        ename = sc.next();
        System.out.println("Enter Your Employee Id");
        eno = sc.nextInt();
        System.out.println("Enter Your City");
        city = sc.next();
        sc.close();
    }
    public static void main(String[] args) {
        HRManager h = new HRManager();
        h.addEmployee();
        h.showEmployee();
        h.work();
    }
}
class HRManager extends Employee{
    public HRManager(){
        super(50000);
    }
    public void work(){
        System.out.println("Stop Doing Whatever you are doing and Bring me a cup of coffee");
    }
    public void showEmployee(){
        System.out.println("Employee Name = "+ename);
        System.out.println("Employee Id = "+ eno);
        System.out.println("Employee City = "+ city);
        System.out.println("Employee Salary = "+esal);
    }
}