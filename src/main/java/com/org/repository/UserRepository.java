package com.org.repository;

import com.org.entity.User;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    @Autowired
    private Session session;

    public void save(User user) {
        session.save(user);
    }
}
