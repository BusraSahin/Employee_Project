package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class OrgStructure extends BaseEntity{

    @Column
    private String unitName;
    @Column
    private String unitHead;

    @OneToMany(mappedBy = "orgStructure")
    private Set<Employee> employeeSet;

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitHead() {
        return unitHead;
    }

    public void setUnitHead(String unitHead) {
        this.unitHead = unitHead;
    }
}
