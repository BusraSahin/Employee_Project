package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class OrgRoles extends BaseEntity {

    @Column
    private String Title;

    @OneToMany(mappedBy = "orgRoles")
    private Set<Employee> employeeSet;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }



}
