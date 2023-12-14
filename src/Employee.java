
//This class is a leaf class
//It will not override any composite method from the abstract class
//It overrides getters and setters and print method
public class Employee  extends CompanyComponent{

    String EmployeeName;

    String EmployeeID;

    double EmployeeSalary;


    public Employee (String EmployeeName, String EmployeeID, double EmployeeSalary) {
        this.EmployeeName = EmployeeName;
        this.EmployeeID = EmployeeID;
        this.EmployeeSalary = EmployeeSalary;
    }

    public String getName () {
        return EmployeeName;
    }

    public String getID () {
        return EmployeeID;
    }

    public double getSalary () {
        return EmployeeSalary;
    }

    public void print () {
        System.out.println("Employee Name: " + getName());
        System.out.println("Employee ID: " + getID());
        System.out.println("Employee Salary: " + getSalary());
    }
}
