package Entity;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class OrgStructureD {

    @Column
    private String UnitName;

    @Column
    private String UnitHead;


    public String getUnitName() {
        return UnitName;
    }

    public void setUnitName(String unitName) {
        UnitName = unitName;
    }

    public String getUnitHead() {
        return UnitHead;
    }

    public void setUnitHead(String unitHead) {
        UnitHead = unitHead;
    }


}
