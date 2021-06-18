package Entity;

import javax.persistence.*;

@Entity
public class EmployeeContact extends  Employee{

    @Column
    private String Street;
    @Column
    private String Cİty;
    @Column
    private String Country;
    @Column
    private long Phone;
    @Column
    private String Mail;

    @JoinColumn
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private  Employee employee;


    public EmployeeContact() {


    }

    public static void main(String[] args) {
      new EmployeeContact();
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getCİty() {
        return Cİty;
    }

    public void setCİty(String Cİty) {
        this.Cİty = Cİty;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public long getPhone() {
        return Phone;
    }

    public void setPhone(long phone) {
        Phone = phone;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }
}
