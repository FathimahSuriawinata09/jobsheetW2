package id.ac.polban.employee.model;

public class Employee {
   private static int nextId = 1; //static field

   private int id; 
   private String name;
   private Department department; //aggregation
   private EmploymentType type; //aggregation
   private double salary;

    public Employee(int id, String name, Department department, EmploymentType type, double salary) {
        this.id = nextId++; 
        this.name = name;
        this.department = department; 
        this.type = type;
        this.salary = salary;
    }
    public int getId() { 
        return id;
    }
    public static int getNextId(){
        return nextId;
    }
    public void setId(int id) { 
        this.id = id;
    }
    public String getName() { 
        return name;
    }
    public void setName(String name) { 
        this.name = name;
    }
    public Department getDepartment() { 
        return department;
    }
    public void setDepartment(Department department) { 
        this.department = department;
    }
    public EmploymentType getType() { 
        return type;
    }
    public void setType(EmploymentType type) { 
        this.type = type;
    }
    public double getSalary() { 
        return salary;
    }
    public void setSalary(double salary) { 
        this.salary = salary;
    }
    }

