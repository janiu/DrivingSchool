package database;

import javax.persistence.*;
import java.util.List;

/**
 * Created by janiu on 2015-07-20.
 */

@Entity
public class Instructor {
    @Id
    @GeneratedValue
    private int idInstructor;

    private String name;
    private String surname;
    private int age;

    /**
     * ABCD
     */
    @OneToMany(mappedBy = "instructor")
    List<Student> students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
