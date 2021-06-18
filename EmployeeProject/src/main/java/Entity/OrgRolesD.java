package Entity;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class OrgRolesD {

    @Column
    private String Title;


    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
