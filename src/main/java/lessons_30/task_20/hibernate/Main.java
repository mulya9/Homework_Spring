package lessons_30.task_20.hibernate;
import lessons_30.task_20.hibernate.repository.StudentRepository;
import lessons_30.task_20.hibernate.session.HibernateSession;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(HibernateSession.class);

        StudentRepository studentRepository = context.getBean(StudentRepository.class);
    }
}
