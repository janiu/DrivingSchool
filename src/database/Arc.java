package database;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by janiu on 2015-07-21.
 */
@Entity
public class Arc {                                      // ³uk
    @Id
    @GeneratedValue
    private int idArc;

    private Date date;

    @ManyToOne
    @JoinColumn(name="idStudent")

    private Student student;

    public Arc(Date date, Student student) {
        this.date = date;
        this.student = student;
    }

    public Arc() {
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
