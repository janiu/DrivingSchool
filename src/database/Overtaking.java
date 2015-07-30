package database;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by janiu on 2015-07-25.
 */

@Entity
public class Overtaking {                   //wyprzedzanie
    @Id
    @GeneratedValue
    private int idOvertaking;

    private Date date;

    @ManyToOne
    @JoinColumn(name="idStudent")
    private Student student;

    public Overtaking(Date date, Student student) {
        this.date = date;
        this.student = student;
    }

    public Overtaking() {

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
