package lessons_30.task_20.hibernate.repository;

import lessons_30.task_20.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    @Autowired
    private Session session;

    public void save(Student student) {
        session.save(student);
    }

    public Student getById(Long id) {
        return session.load(Student.class,id);
    }

    public void deleteStudent(Long id) {
        Transaction transaction = session.beginTransaction();
        session.createQuery("DELETE FROM Student s WHERE s.id =:id")
                .setParameter("id",id).executeUpdate();
        transaction.commit();
    }

    public void updateStudent(Student student) {
        Transaction transaction = session.beginTransaction();
        Student studentById = getById(student.getId());
        studentById=student;
        session.merge(studentById);
        transaction.commit();
    }
}
