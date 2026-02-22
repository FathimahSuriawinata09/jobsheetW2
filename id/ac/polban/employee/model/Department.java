package id.ac.polban.employee.model;

public class Department {
    private String name;

    private static int countDepartment = 0; //static field

    public Department(String name) { 
        this.name = name;
        countDepartment++;
    }

    public String getName() { 
        return name;
    }
    public void setName(String name) { 
        this.name = name;
    }

    public static int getDepartmentCount() { //static method
        return countDepartment;
    }
}

