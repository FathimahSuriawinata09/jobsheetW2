package id.ac.polban.employee.model;

public class EmploymentType {
    private String type;

    public static final String PERMANENT = "Permanent";
    public static final String CONTRACT = "Contract";
    public static final String INTERN = "Intern";

    public EmploymentType(String type) { 
        this.type = type;
    }

    public String getType() { 
        return type;
    }

    public void setType(String type) { 
        this.type = type;
    }
}
