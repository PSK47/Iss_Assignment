public class Employee {

    // Basic Data Types
    int employeeId;
    String employeeName;
    double salary;

    // Variable Types
    public static int totalEmployees; // static variable
    private boolean isFullTime; // instance variable

    // Modifier Types
    public static final String COMPANY_NAME = "ABC Corp.";

    // Constructors
    public Employee() {
        // Default constructor
        totalEmployees++;
    }

    public Employee(int empId, String empName, double empSalary, boolean fullTime) {
        // Parameterized constructor
        this.employeeId = empId;
        this.employeeName = empName;
        this.salary = empSalary;
        this.isFullTime = fullTime;
        totalEmployees++;
    }

    // Getter and Setter methods
    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }


    public static void main(String[] args) {
        // Creating instances of the Employee class
        Employee emp1 = new Employee();
        Employee emp2 = new Employee(101, "John Doe", 50000.0, true);

        // Accessing variables
        System.out.println("Employee 1 ID: " + emp1.employeeId);
        System.out.println("Employee 2 Name: " + emp2.employeeName);
        System.out.println("Employee 2 Salary: " + emp2.salary);

        // Accessing static variable
        System.out.println("Total Employees: " + Employee.totalEmployees);

        // Accessing constant variable
        System.out.println("Company Name: " + Employee.COMPANY_NAME);
    }
}

