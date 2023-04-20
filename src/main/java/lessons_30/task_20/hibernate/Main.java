package lessons_30.task_20.hibernate;
import lessons_30.task_20.hibernate.entity.Student;
import lessons_30.task_20.hibernate.repository.StudentRepository;
import lessons_30.task_20.hibernate.session.HibernateSession;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(HibernateSession.class);

        StudentRepository studentRepository = context.getBean(StudentRepository.class);

        studentRepository.save(new Student("Ben","rev@gmail.com"));

       // studentRepository.getById(2L);

       // studentRepository.deleteStudent(3L);
        //studentRepository.updateStudent(new Student(1L,"Bob","gov@gmail.com"));

    }
}
