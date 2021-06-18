package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Project extends BaseEntity{

    @Column
    private String ProjectName;
    @Column
    private String EmployeProject;

    @OneToMany(mappedBy = "Project")
    private Set<EmployeeProject> employeeProjectSet;


    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }

    public String getEmployeProject() {
        return EmployeProject;
    }

    public void setEmployeProject(String employeProject) {
        EmployeProject = employeProject;
    }
}
