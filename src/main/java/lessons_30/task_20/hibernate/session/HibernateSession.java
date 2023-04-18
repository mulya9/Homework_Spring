package lessons_30.task_20.hibernate.session;

import com.org.entity.User;
import lessons_30.task_20.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Properties;
@Configuration
@ComponentScan("lessons_30.task_20.hibernate.repository")
@PropertySource("application.properties")
public class HibernateSession {

    private static SessionFactory sessionFactory;
    @Value("${db.url}")
    private String URL;

    @Value("${db.user}")
    private String USERNAME;

    @Value("${db.password}")
    private String PASSWORD;

    @Bean
    public Session session() {
        SessionFactory sessionFactory = null;

        try {
            org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();
            Properties properties = new Properties();
            properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
            properties.put(Environment.URL, URL);
            properties.put(Environment.USER, USERNAME);
            properties.put(Environment.PASS, PASSWORD);
            properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
            properties.put(Environment.SHOW_SQL, "true");
            properties.put(Environment.HBM2DDL_AUTO, "update");
            configuration.setProperties(properties);
            configuration.addAnnotatedClass(User.class);
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Exception e) {

            System.out.println("Some error: " + e.getMessage());
        }

        return sessionFactory.openSession();
    }
}
