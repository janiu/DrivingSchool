package database;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by janiu on 2015-07-21.
 */
public class SaveToDatabase {

    static     EntityManagerFactory entityManagerFactory ;
    static     EntityManager entityManager ;

    public void openConnectDatabase() {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(java.util.logging.Level.OFF);
        entityManagerFactory = Persistence.createEntityManagerFactory("NewPersistenceUnit");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public void closeConnectDatabase()    {
        entityManager.close();
        entityManagerFactory.close();
    }

    public void saveDate(Object temp)    {
        entityManager.getTransaction().begin();
        entityManager.persist(temp);
        entityManager.getTransaction().commit();
    }

    public void saveDate(Object temp, Object temp2)    {
        entityManager.getTransaction().begin();
        entityManager.persist(temp);
        entityManager.persist(temp2);
        entityManager.getTransaction().commit();
    }

    public void saveDate(Object temp, Object temp2, Object temp3)    {
        entityManager.getTransaction().begin();
        entityManager.persist(temp);
        entityManager.persist(temp2);
        entityManager.persist(temp3);
        entityManager.getTransaction().commit();
    }

    public String[] loadDateInstructor()    {

        ArrayList<String> temp = new ArrayList<>();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("SELECT concat(e.name,' ',e.surname),0 FROM Instructor e");
        Iterator<?> iterator = query.getResultList().iterator();
        while (iterator.hasNext()) {
            Object[] item = (Object[])iterator.next();
            String name = (String) item[0];
            temp.add(name);
        }
        entityManager.getTransaction().commit();

        String[] tab = new String[temp.size()];
        for(int i=0 ; i<temp.size(); i++)
        {
            tab[i]=temp.get(i);
        }

        return tab;
    }

   public Instructor findInstructorById(int indeks)    {
        entityManager.getTransaction().begin();
        Instructor instructor = entityManager.find(Instructor.class, indeks);
        entityManager.getTransaction().commit();
        return instructor;
    }

    public Student findStudentById(int indeks)    {

        Student student;
        entityManager.getTransaction().begin();
        student = entityManager.find(Student.class,indeks);
        entityManager.getTransaction().commit();
        return student;
    }

    public String[] loadDateStudent()    {
        ArrayList<String> temp = new ArrayList<>();

        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("SELECT concat(e.name,' ',e.surname),0 FROM Student e");
        Iterator<?> iterator = query.getResultList().iterator();
        while (iterator.hasNext()) {
            Object[] item = (Object[])iterator.next();
            String name = (String) item[0];
            temp.add(name);
        }
        entityManager.getTransaction().commit();
        String[] tab = new String[temp.size()];
        for(int i=0 ; i<temp.size(); i++)
        {
            tab[i]=temp.get(i);
        }
        return tab;
    }
}
