package Entity;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ProjectD {

    @Column
    private String ProjectName;

    @Column
    private String EmployeeProject;



    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }

    public String getEmployeeProject() {
        return EmployeeProject;
    }

    public void setEmployeeProject(String employeeProject) {
        EmployeeProject = employeeProject;
    }


}
