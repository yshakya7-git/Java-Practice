package streamapi.primitivestream;

import org.w3c.dom.ls.LSOutput;
import streamapi.infinitestream.GenerateStream;
import streamapi.infinitestream.IterateStream;

import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import static streamapi.primitivestream.EmpList.getEmployeeList;

public class MainClass {
    public static void main(String[] args) {
        List<Employee> employees = getEmployeeList();

        List<String> employeeName = employees.stream()
                .map(e -> e.getName())
                .map(a -> a.toUpperCase())
                .filter(e -> e.startsWith("J"))
                .collect(Collectors.toList());

        List<Integer> employeeAge = employees.stream()
                .map(e -> e.getAge())
                .limit(2)
                .distinct()
                .collect(Collectors.toList());

        List<String> listOfCities = employees.stream().flatMap(x -> x.getListOfCities().stream()).collect(Collectors.toList());

        //allMatch method
        boolean allMatch = employees.stream().allMatch(u -> u.getAge() > 10);

        // forEach Method
        employees.stream().forEach(employee -> System.out.println(employee.getListOfCities()));



        System.out.println("Employee Name : " + employeeName);
        System.out.println("Employee Age : " + employeeAge);
        System.out.println("Employee Age greater than 10 : " + allMatch);


//       Q. Given a list of employees, you need to find all the employees whose age is greater than 30 and print the employee names.(Java 8 APIs only)

        List<String> emp = employees.stream().filter(e -> e.getAge() > 30).map(Employee::getName).collect(Collectors.toList());
        System.out.println("Employee Age and Name greater than 30 : " + emp);

//        Given the list of employees, find the count of employees with age greater than 25?
        long countEmployee = employees.stream().filter(c -> c.getAge() > 25).map(Employee::getAge).count();
        System.out.println("Employee Age greater than 25 count : " + countEmployee);

//        Given a list of employees, You need to find highest age of employee?
        OptionalInt max = employees.stream().mapToInt(Employee::getAge).min();
        if (max.isPresent()) {
            System.out.println("The highest age of employee is :" + max);
        }

        // Given a list of employees, you need sort employee list by age? Use java 8 APIs only

        List<Employee> sortList = employees.stream().sorted((e1, e2) -> e1.getAge() + e2.getAge()).collect(Collectors.toList());
        sortList.forEach(System.out::println);

        // groupingBy method

        Map<String, List<Employee>> map = employees.stream().collect(Collectors.groupingBy(Employee::getName));
        map.forEach((name, employeeListTemp) -> System.out.println("Name: " + name + " ==>" + employeeListTemp));


        // generate stream method
        GenerateStream generateStream=new GenerateStream();
        generateStream.generateRandomStream();


//        iterate method

        IterateStream iterateStream=new IterateStream();
        iterateStream.getIterate();

        employees.stream().parallel().forEach(System.out::println);
    }




}

