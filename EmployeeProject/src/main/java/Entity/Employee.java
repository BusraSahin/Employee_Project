package Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Employee extends BaseEntity {

    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String placeOfBirth;
    @Column
    private String dateOfBirth;


    @OneToMany(mappedBy = "employee")
    private Set<EmployeeContact> employeeContactSet;

    @JoinColumn
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private OrgRoles orgRoles;

    @OneToMany(mappedBy ="employee")
    private Set<EmployeeProject> employeeProjectSet;

    @JoinColumn
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private OrgStructure orgStructure;


    public Employee() {
        this.firstName = firstName;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getDateOfBİrth() {
        return dateOfBirth;
    }

    public void setDateOfBİrth(String dateOfBİrth) {
        this.dateOfBirth = dateOfBİrth;
    }

    public OrgRoles getOrgRoles() {
        return orgRoles;
    }

    public void setOrgRoles(OrgRoles orgRoles) {
        this.orgRoles = orgRoles;
    }

    public void Name() {

    }
}







