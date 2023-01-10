import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|| Employee Management ||");
        Office office = new Office();
        System.out.println("Enter number of employees: ");
        int noe = sc.nextInt();
        System.out.println("Enter Employee Details: ");
        for(int j=0;j<noe;j++)
        {
            office.addEmployee();
        }

        System.out.println("\n||Employees Details: ...............||");
        office.Display();
        System.out.println();
        System.out.println("||Enter any integer to continue; -1 for Exit;||");
        int ch = sc.nextInt();
        while (ch != -1) {
            System.out.println("\n||1>> Sort by ID  2>> Sort by Name  3>> Sort by Salary -1>>Exit||");
            int choice = sc.nextInt();
            if (choice == 1) {
                SortEmployee sortEmployee = new SortEmployee();
                SortID sortID = sortEmployee;
                sortID.SortID(office);
                office.Display();

            } else if (choice == 2) {
                SortEmployee sortEmployee = new SortEmployee();
                SortName sortName = sortEmployee;
                sortName.sortName(office);
                office.Display();

            } else if (choice == 3) {
                SortEmployee sortEmployee = new SortEmployee();
                SortSal sortSal = sortEmployee;
                sortSal.sortSal(office);
                office.Display();

            } else if (choice == -1) {
                break;

            }
            else
                System.out.println("Invalid Choice!!");

        }
    }
}