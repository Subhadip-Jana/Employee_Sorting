import java.util.Scanner;

public class Employee {
    private int employeeID;
    private String employeeName;
    private int employeeSalary;

    public Employee() {
        employeeID = 0;
        employeeName = "";
        employeeSalary = 0;
    }

    public Employee(int employeeID, String employeeName, int employeeSalary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee Details: [" +
                "employeeID: " + employeeID +
                ", employee Name: '" + employeeName + '\'' +
                ", employee Salary: " + employeeSalary +
                ']';
    }

    Scanner sc = new Scanner(System.in);
    public void read()
    {

        System.out.println("\nEnter employee ID: ");
        employeeID = sc.nextInt();
        System.out.println("Enter employee Name: ");
        employeeName = sc.next();
        System.out.println("Enter Salary: ");
        employeeSalary = sc.nextInt();

    }
}
