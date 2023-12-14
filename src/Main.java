public class Main {
    public static void main(String[] args) {
        CompanyComponent systemDevelopment = new Department("systemDevelopment", "CEO", "1");
        CompanyComponent softwareDevelopment = new Department("softwareDevelopment", "CTO", "2");


        CompanyComponent AllDepartments = new Department("AllDepartments", "CEO", "001");

        AllDepartments.add(systemDevelopment);
        AllDepartments.add(softwareDevelopment);

        CompanyComponent employee1 = new Employee("employee1", "1", 1000);

        CompanyComponent employee2 = new Employee("employee2", "2", 2000);

        systemDevelopment.add(employee1);
        softwareDevelopment.add(employee2);



        AllDepartments.print();



    }
}