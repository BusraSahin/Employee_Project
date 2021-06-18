package dao;
import Entity.Employee;
import Util.SessionUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import java.util.List;

public class EmployeeDaoD extends BaseDaoImpD {

    public List<Employee> getList(int limit){

        Session session=null;
        List<Employee> empList;

    try{

        session = SessionUtil.getInstance().getSession();
        Query query = session.createQuery("select emp form Employee emp");
        empList= query.setMaxResults(limit).list();

    }catch (Exception e){
        e.printStackTrace();
        System.out.println("Hatalı Listeleme!");
        return null;

    }finally {
        session.close();

    }
    return empList;

    }
}



