package Entity;

import javax.persistence.*;

@Entity
public class EmployeeProject extends Employee{

    @Column
    private String Employe;
    @Column
    private String Project;

   @JoinColumn
  @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
  private Employee employee;

   @JoinColumn
   @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
   private Project project;

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setFirstName("Büşra");
        employee.setLastName("Şahin");
        employee.setDateOfBİrth("1997");
        employee.setPlaceOfBirth("Ankara");

        System.out.println("ADI: "+employee.getFirstName());
        System.out.println("SOYADI: "+employee.getFirstName());
        System.out.println("DOĞUM TARİHİ: "+employee.getDateOfBİrth());
        System.out.println("DOĞUM YERİ:"+employee.getPlaceOfBirth());
    }
    public String getEmploye() {
        return Employe;
    }

    public void setEmploye(String employe) {
        Employe = employe;
    }

    public String getProject() {
        return Project;
    }

    public void setProject(String project) {
        Project = project;
    }


}
