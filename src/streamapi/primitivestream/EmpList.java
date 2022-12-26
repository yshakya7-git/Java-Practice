package streamapi.primitivestream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmpList {
    public static List<Employee> getEmployeeList(){
        List<Employee> employeeList=new ArrayList<>();
        Employee e1 = new Employee("Mohan", 24, Arrays.asList("Newyork","Banglore"));
        Employee e2 = new Employee("John", 27,Arrays.asList("Paris","London"));
        Employee e3 = new Employee("Jamry", 32,Arrays.asList("Pune","Seattle"));
        Employee e4 = new Employee("Amita", 22,Arrays.asList("Chennai","Hyderabad"));

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);

        return employeeList;
    }
}
