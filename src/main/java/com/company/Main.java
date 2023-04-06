package com.company;

import com.company.entity.Passport;
import com.company.entity.User;
import com.company.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();


//        session.save(new User("Leo",20000.0));
//       session.update(new User(1L,"tom",24000.0));
//        User singleResult = session.createQuery("FROM User u WHERE u.id = 1 ", User.class).getSingleResult();
//        System.out.println(session.createQuery("FROM User ").list());
//        singleResult.setAddress("Some Address");
//        session.persist(singleResult);
//           User user = new User("Tom", 2300.0, "Doe", 42, "london");
//           user.setPassport(new Passport("Some Info"));
//
//          session.save(user);


           transaction.commit();

    }
}
