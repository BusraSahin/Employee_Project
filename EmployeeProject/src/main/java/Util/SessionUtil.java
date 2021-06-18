package Util;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class SessionUtil {

    private static SessionUtil sessionUtil;
    private static SessionFactory sessionFactory;
    private static Session session;
    private Configuration configuration;

    public SessionUtil () throws HibernateException
    {
        configuration = new Configuration().configure();
        sessionFactory=configuration.buildSessionFactory();
    }
    public static synchronized SessionUtil getInstance()
    {
        if(sessionUtil == null)
        {
            sessionUtil= new SessionUtil();
        }
        return sessionUtil;
    }

    public Session getSession() throws HibernateException{
        session=sessionFactory.openSession();
        if(!session.isConnected())
        {
this.reconnect();
        }
        return session;
    }

    private void reconnect() throws HibernateException{

        this.sessionFactory = configuration.buildSessionFactory();
    }



}
