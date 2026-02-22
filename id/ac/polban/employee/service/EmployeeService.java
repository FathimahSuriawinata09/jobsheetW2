package id.ac.polban.employee.service;

import java.util.HashMap; //dependency
import java.util.Map;//dependency

import id.ac.polban.employee.model.*;

// mengelola operasi yang berkaitan dengan data dan aturan bisnis 
public class EmployeeService {
    private Map<Integer, Employee> employees = new HashMap<>();//aggregation

    public static double calculateBonus(double salary, double percent) {
        return salary * percent / 100;
    }
    public void addEmployee(Employee emp) { //dependency
        employees.put(emp.getId(), emp);
    }
    public Employee getEmployee(int id) { //dependency
        return employees.get(id);
    }
    public void raiseSalary(int id, double percent) { 
        Employee emp = employees.get(id);
        if (emp != null) {
            emp.setSalary(emp.getSalary() * (1 + percent/100));
        }
    }
}
