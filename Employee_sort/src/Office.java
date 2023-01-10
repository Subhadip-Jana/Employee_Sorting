public class Office {

    private int employeeCounter;
     Employee[] employees;

    public Office() {
        employeeCounter = 0;
        employees = new Employee[20];
    }

    public int getEmployeeCounter() {
        return employeeCounter;
    }

    public void setEmployeeCounter(int employeeCounter) {
        this.employeeCounter = employeeCounter;
    }

    public void addEmployee(){

            employees[employeeCounter] = new Employee();
            employees[employeeCounter].read();
            employeeCounter++;

    }

    public void Display()
    {
        for (int i=0;i<employeeCounter;i++)
            System.out.println(employees[i].toString());
    }

}
