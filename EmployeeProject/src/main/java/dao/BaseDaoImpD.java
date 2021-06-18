package dao;
import Entity.BaseEntity;
import Util.SessionUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BaseDaoImpD  implements BaseDaoD{


    @Override
    public BaseEntity save(BaseEntity entity) {

        Session session = null;
        Transaction transaction =null;

        try{

        session = SessionUtil.getInstance().getSession();
        transaction=session.beginTransaction();
        session.save(entity);
        transaction.commit();

        }catch (Exception e){

            e.printStackTrace();
            session.getTransaction().rollback();

        }finally {
            session.close();
            System.out.println("Session Kapatıldı");
        }

        return entity;
    }

    @Override
    public void delete(BaseEntity entity) {

    }

    @Override
    public BaseEntity list(BaseEntity entity) {
        return null;
    }

    @Override
    public BaseEntity Update(BaseEntity entity) {
        return null;
    }
}
