package model;

import database.*;
import database.Instructor;
import enumation.Level;
import view.AddStudent;
import view.ShowStudent;

import javax.swing.*;

/**
 * Created by janiu on 2015-07-21.
 */
public class Student {
    SaveToDatabase svd;

    public void setStudent(AddStudent frame)    {
        svd = new SaveToDatabase();
        int indeks=0;
        for (int i=0 ; i<frame.getTab().length; i++)
        {
            if (frame.getTab()[i]==frame.getSelectedInstructor())
            {
                indeks=i;
                indeks=indeks+1;
            }
        }

        Instructor instructor= svd.findInstructorById(indeks);

        database.Student student = new database.Student();
        database.Level level = new database.Level();

        student.setName(frame.gettName().getText());
        student.setSurname(frame.gettSurname().getText());
        student.setPlace(frame.gettPlace().getText());
        student.setAge(Integer.parseInt(frame.gettAge().getText()));
        student.setInstructor(instructor);

        level.setStudent(student);
        student.setLevel(level);

        svd.saveDate(student, level);
    }

    public String showStudent(ShowStudent frame)    {
        String text="";
        database.Student student;
        int indeks=0;
        for (int i=0 ; i<frame.getTab().length; i++)
        {
            if (frame.getTab()[i]==frame.getSelectedStudent())
            {
                indeks=i;
                indeks=indeks+1;
            }
        }

        student = frame.getStd().findStudentById(indeks);

        text="Name: "+student.getName()+"\nSurname: "+student.getSurname()+"\nPlace: "+student.getPlace()+
                "\nAge: "+student.getAge()+"\nInstructor: "+student.getInstructor().getName()+" "+student.getInstructor().getSurname()+
                "\nHours: "+student.getHours()+"\n\n";

        text=text+"Moving Off:\nDate: ";
        for(MovingOff x : student.getMovingOffs())
        {

            text=text+x.getDate()+" || ";
        }
        text=text+"\nLevel: "+student.getLevel().getMovingOff();

        text=text+"\n\nArc:\nDate: ";
        for(Arc x : student.getArcs())
        {

            text=text+x.getDate()+" || ";
        }
        text=text+"\nLevel: "+student.getLevel().getArc();

        text=text+"\n\nMoving Off The Hill:\nDate: ";
        for(MovingOffTheHill x : student.getMovingOffTheHills())
        {

            text=text+x.getDate()+" || ";
        }
        text=text+"\nLevel: "+student.getLevel().getMobingOffTheHill();

        text=text+"\n\nHorse Roads One-Way:\nDate: ";
        for( HorseRoadsOneWay x : student.getHorseRoadsOneWay())
        {

            text=text+x.getDate()+" || ";
        }
        text=text+"\nLevel: "+student.getLevel().getHorseRoadsOneWay();

        text=text+"\n\nInhibition At The Site:\nDate: ";
        for(InhibitionAtTheSite x : student.getInhibitionAtTheSite())
        {

            text=text+x.getDate()+" || ";
        }
        text=text+"\nLevel: "+student.getLevel().getInhibitionAtTheSite();

        text=text+"\n\nJoin The Traffic:\nDate: ";
        for(JoinTheTraffic x : student.getJoinTheTraffic())
        {

            text=text+x.getDate()+" || ";
        }
        text=text+"\nLevel: "+student.getLevel().getJoinTheTraffic();

        text=text+"\n\nOvertaking:\nDate: ";
        for(Overtaking x : student.getOvertaking())
        {

            text=text+x.getDate()+" || ";
        }
        text=text+"\nLevel: "+student.getLevel().getOvertaking();

        text=text+"\n\nParallel Parking:\nDate: ";
        for(ParallelParking x : student.getParallelParking())
        {

            text=text+x.getDate()+" || ";
        }
        text=text+"\nLevel: "+student.getLevel().getParallelParking();

        text=text+"\n\nParking Oblique:\nDate: ";
        for(ParkingOblique x : student.getParkingOblique())
        {

            text=text+x.getDate()+" || ";
        }
        text=text+"\nLevel: "+student.getLevel().getParkingOblique();

        text=text+"\n\nPerpendicular Parking:\nDate: ";
        for(PerpendicularParking x : student.getPerpendicularParking())
        {

            text=text+x.getDate()+" || ";
        }
        text=text+"\nLevel: "+student.getLevel().getPerpendicularParking();

        text=text+"\n\nRecirculation Of An Infrastructure:\nDate: ";
        for(RecirculationOfAnInfrastructure x : student.getRecirculationOfAnInfrastructure())
        {

            text=text+x.getDate()+" || ";
        }
        text=text+"\nLevel: "+student.getLevel().getRecirculationOfAnInfrastructure();

        text=text+"\n\nRecirculation Of Three:\nDate: ";
        for(RecirculationOfThree x : student.getRecirculationOfThree())
        {

            text=text+x.getDate()+" || ";
        }
        text=text+"\nLevel: "+student.getLevel().getRecirculationOfThree();

        text=text+"\n\nRecycling At The Crossroads:\nDate: ";
        for(RecyclingAtTheCrossroads x : student.getRecyclingAtTheCrossroads())
        {

            text=text+x.getDate()+" || ";
        }
        text=text+"\nLevel: "+student.getLevel().getRecyclingAtTheCrossroads();

        return text;
    }
}
