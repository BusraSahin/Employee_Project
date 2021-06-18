package Entity;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class EmployeeContactD {


    @Column
    private String Street;

    @Column
    private String City;

    @Column
    private String County;

    @Column
    private Long Phone;

    @Column
    private String Email;


    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCounty() {
        return County;
    }

    public void setCounty(String county) {
        County = county;
    }

    public Long getPhone() {
        return Phone;
    }

    public void setPhone(Long phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }


}
