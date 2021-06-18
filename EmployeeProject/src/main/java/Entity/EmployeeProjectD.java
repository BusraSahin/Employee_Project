package Entity;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class EmployeeProjectD {


    @Column
    private String Employee;

    @Column
    private String Project;


    public String getEmployee() {
        return Employee;
    }

    public void setEmployee(String employee) {
        Employee = employee;
    }

    public String getProject() {
        return Project;
    }

    public void setProject(String project) {
        Project = project;
    }

}
