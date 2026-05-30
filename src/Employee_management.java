public class Employee_management {
    void employee_names(){
        String emp1="bharath";
        String emp2="achari";
        String emp3="harsha";
        System.out.println("the employees are:"+emp1+" "+emp2+" "+emp3);
    }

}
class Designation extends Employee_management{
    void emp_role(){
        String emp1="devops";
        String emp2="developer";
        String emp3="manager";
        System.out.println("roles"+" "+"emp1:"+" "+emp1+" "+"emp2:"+" "+emp2+" "+"emp3:"+" "+emp3);
    }
}
class Salary extends Designation{
    void salary(){
        int salary=20000;
        System.out.println("employees salaries are:"+salary);
    }

    public static void main(String[] args) {
        Salary obj=new Salary();
        obj.employee_names();
        obj.emp_role();
        obj.salary();

    }
}
