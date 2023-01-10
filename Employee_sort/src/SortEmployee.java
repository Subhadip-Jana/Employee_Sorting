public class SortEmployee implements SortID,SortName,SortSal{

    @Override
    public void SortID(Office f) {
        Employee temp;
        Employee[] arr = f.employees;
        for (int i = 0; i < f.getEmployeeCounter() - 1; i++) {
            for (int j = 0; j < f.getEmployeeCounter() - 1 - i; j++) {
                if (arr[j].getEmployeeID() > arr[j + 1].getEmployeeID()) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }

    @Override
    public void sortName(Office f) {
        Employee temp;
        Employee[] arr=f.employees;
        for (int i = 0; i < f.getEmployeeCounter(); i++) {
            for (int j = i + 1; j < f.getEmployeeCounter(); j++) {

                // to compare one string with other strings
                if (arr[i].getEmployeeName().compareTo(arr[j].getEmployeeName()) > 0) {
                    // swapping
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    @Override
    public void sortSal(Office f) {
        Employee temp;
        Employee[] arr=f.employees;
        for(int i=0;i<f.getEmployeeCounter()-1;i++)
        {
            for(int j=0;j< f.getEmployeeCounter()-1-i;j++)
            {
                if(arr[j].getEmployeeSalary()>arr[j+1].getEmployeeSalary())
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

}

