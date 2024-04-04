package com.dgmf.e.streamapi.a.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingEmployees {
    public static void main(String[] args) {
        // List of Employees
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(
                1, "John Doe", 30, 4000
        ));
        employeeList.add(new Employee(
                2, "Willem Delano", 27, 2500
        ));
        employeeList.add(new Employee(
                4, "Oscar Peslet", 52, 7000
        ));
        employeeList.add(new Employee(
                4, "Bart Guert", 44, 9000
        ));

        System.out.println(employeeList);

        // Sort Employees in Ascending Order of Salaries
        List<Employee> ascendingEmployeeSalaryList = employeeList.stream()
                .sorted(new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        return (int) (o1.getSalary() - o2.getSalary());
                    }
                })
                .collect(Collectors.toList());

        System.out.println("===== Ascending Order =====");
        System.out.println(ascendingEmployeeSalaryList);

        // Using Lambda Expressions
        List<Employee> lambdaAscendingEmployeeSalaryList = employeeList.stream()
                // .sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()))
                .sorted(Comparator.comparingLong(Employee::getSalary))
                .collect(Collectors.toList());

        System.out.println(lambdaAscendingEmployeeSalaryList);

        // Sort Employees in Descending Order of Salaries
        List<Employee> descendingEmployeeSalaryList = employeeList.stream()
                .sorted(new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        return (int) (o2.getSalary() - o1.getSalary());
                    }
                })
                .collect(Collectors.toList());

        System.out.println("===== Descending Order =====");
        System.out.println(descendingEmployeeSalaryList);

        // Using Lambda Expressions
        List<Employee> lambdaDescendingEmployeeSalaryList = employeeList.stream()
                // .sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
                .sorted(Comparator.comparingLong(Employee::getSalary).reversed())
                .collect(Collectors.toList());

        System.out.println(lambdaDescendingEmployeeSalaryList);
    }
}
