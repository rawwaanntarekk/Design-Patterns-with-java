import java.util.ArrayList;
import java.util.Iterator;
//This is a composite class
public class Department extends CompanyComponent {

    ArrayList employees = new ArrayList();
    String DepartmentName;

    String DepartmentHead;

    String DepartmentID;

    public Department (String DepartmentName, String DepartmentHead, String DepartmentID) {
        this.DepartmentName = DepartmentName;
        this.DepartmentHead = DepartmentHead;
        this.DepartmentID = DepartmentID;
    }


    // The first 3 methods are for the composite class , it will override them.
    public void add (CompanyComponent employee) {
        employees.add(employee);
    }

    public void remove (CompanyComponent employee) {
        employees.remove(employee);
    }

    public String getName () {
        return DepartmentName;
    }

    public String getDepartmentHead () {
        return DepartmentHead;
    }


    public String getID () {
    return DepartmentID;
    }

    public void print () {
        System.out.println("Department Name: " + getName());
        System.out.println("Department Head: " + getDepartmentHead());
        System.out.println("Department ID: " + getID());
        System.out.println("Employees: ");
        for (Object employee : employees) { // Here we can use Iterator pattern
            CompanyComponent employeeComponent = (CompanyComponent) employee;
            employeeComponent.print();
        }
         // Here we can use Iterator pattern
//        Iterator employeeIterator = employees.iterator();
//        while (employeeIterator.hasNext()) {
//            CompanyComponent employeeComponent = (CompanyComponent) employeeIterator.next();
//            employeeComponent.print();
//        }
    }
}
