//create a class called Employee with methods called work() and getSalary(). 
//Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().

class Employee{
    void work(){
      System.out.println("IT Enginner");  
    }
    int getSalary(int Salary){
        System.out.println("Salary: "+Salary);
        return Salary;
    }
}
class HRManager extends Employee{
    @Override
    void work(){
        System.out.println("Computer Enginner");
    }
    String addEmployee(String Employee){
        System.out.println("Employee: "+Employee);
        return Employee;
    }
}
public class W3Q4 {
    public static void main(String[] args) {
        int Salary=50000;
        String Employee="Pritee Patil";
        HRManager HR=new HRManager();
        Employee E=new Employee();
        E.getSalary(Salary);
        E.work();
        HR.addEmployee(Employee);
        HR.work();
    }
}
