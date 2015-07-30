package database;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by janiu on 2015-07-20.
 */
@Entity
public class MovingOff {                        //ruszanie z miejsca
    @Id
    @GeneratedValue
    private int idMovingOff;

    private Date date;

    @ManyToOne
    @JoinColumn(name="idStudent")
    private Student student;

    public MovingOff(Date date, Student student) {
        this.date = date;
        this.student = student;
    }

    public MovingOff() {
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

