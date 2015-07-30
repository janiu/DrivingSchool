package database;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by janiu on 2015-07-25.
 */

@Entity
public class PerpendicularParking {
    @Id
    @GeneratedValue
    private int idPerpendicularParking;

    private Date date;

    @ManyToOne
    @JoinColumn(name="idStudent")
    private Student student;

    public PerpendicularParking() {                                 //parkowanie prostopadłe
    }

    public PerpendicularParking(Date date, Student student) {

        this.date = date;
        this.student = student;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
