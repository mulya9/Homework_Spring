package lessons_30.task_20.hibernate;

import lessons_30.task_20.hibernate.entity.Student;
import lessons_30.task_20.hibernate.session.HibernateSession;
import org.hibernate.Session;

public class Main {

    Session session = HibernateSession.getSessionFactory().openSession();

}
