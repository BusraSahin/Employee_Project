package Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity
public class EmployeeD {

    @Column
    private String Firstname;

    @Column
    private String Lastname;

    @Column
    private String PlaceofBirth;

    @Column
    private Date DateofBirth;






    public String getFirsname() {
        return Firstname;
    }

    public void setFirsname(String firsname) {
        Firstname = firsname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getPlaceofBirth() {
        return PlaceofBirth;
    }

    public void setPlaceofBirth(String placeofBirth) {
        PlaceofBirth = placeofBirth;
    }

    public Date getDateofBirth(String s) {
        return DateofBirth;
    }

    public void setDateofBirth(Date dateofBirth) {
        DateofBirth = dateofBirth;
    }

}
