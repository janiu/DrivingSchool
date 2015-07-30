package model;

import database.*;
import database.Level;
import enumation.*;
import view.AddLesson;

import java.util.ArrayList;
import java.util.List;

import static database.SaveToDatabase.*;

/**
 * Created by janiu on 2015-07-21.
 */
public class Date {

    public void setDate(AddLesson frame)    {
        database.Student student=null ;
        database.Level level = new database.Level();
        model.SelectLevel selectLevel = new model.SelectLevel();
        int indeks=0;
        for (int i=0 ; i<frame.getTab().length; i++)                                //wyszukanie indeksu wybranego studenta
        {
            if (frame.getTab()[i]==frame.getSelectedStudent())
            {
                indeks=i;
                indeks=indeks+1;
            }
        }

        student = frame.getSvd().findStudentById(indeks);                           //wyszukanie wybranego studenta
        student.setHours(student.getHours() + 1);                                   //zwiekszenie ilosci godzin jazd

        java.util.Date date = new java.util.Date(frame.getSelectedYear()-1900,frame.getSelectedMonth()-1,
                frame.getSelectedDay(),frame.getSelectedHour(), frame.getSelectedMinute());

        //ustawienie odpowienich umiejtnosci w bazie danych
        if(frame.getCheckBoxTable()[0].isSelected())
        {
            level.copy(student);
            level.setStudent(student);
            level.setArc(selectLevel.selectLevel(frame.getSelectedLevel()[0]));  // selectLevel.selectLevel(frame.getSelectedLevel()[0])

            student.setLevel(level);
            Arc temp = new Arc(date,student);
            student.getArcs().add(temp);
            frame.getSvd().saveDate(temp,  student, level);
        }

        if(frame.getCheckBoxTable()[1].isSelected())
        {
            level.copy(student);
            level.setStudent(student);
            level.setHorseRoadsOneWay(selectLevel.selectLevel(frame.getSelectedLevel()[1]));
            student.setLevel(level);
            HorseRoadsOneWay temp = new HorseRoadsOneWay(date,student);
            student.getHorseRoadsOneWay().add(temp);
            frame.getSvd().saveDate(temp,  student, level);
        }

        if(frame.getCheckBoxTable()[2].isSelected())
        {
            level.copy(student);
            level.setStudent(student);
            level.setInhibitionAtTheSite(selectLevel.selectLevel(frame.getSelectedLevel()[2]));
            student.setLevel(level);
            InhibitionAtTheSite temp = new InhibitionAtTheSite(date,student);
            student.getInhibitionAtTheSite().add(temp);
            frame.getSvd().saveDate(temp,  student, level);
        }

        if(frame.getCheckBoxTable()[3].isSelected())
        {
            level.copy(student);
            level.setStudent(student);
            level.setJoinTheTraffic(selectLevel.selectLevel(frame.getSelectedLevel()[3]));
            student.setLevel(level);
           JoinTheTraffic temp = new JoinTheTraffic(date,student);
            student.getJoinTheTraffic().add(temp);
            frame.getSvd().saveDate(temp,  student, level);
        }

        if(frame.getCheckBoxTable()[4].isSelected())
        {
            level.copy(student);
            level.setStudent(student);
            level.setMovingOff(selectLevel.selectLevel(frame.getSelectedLevel()[4]));
            student.setLevel(level);
            MovingOff temp = new MovingOff(date,student);
            student.getMovingOffs().add(temp);
            frame.getSvd().saveDate(temp,  student, level);
        }

        if(frame.getCheckBoxTable()[5].isSelected())
        {
            level.copy(student);
            level.setStudent(student);
            level.setMobingOffTheHill(selectLevel.selectLevel(frame.getSelectedLevel()[5]));
            student.setLevel(level);
          MovingOffTheHill  temp = new MovingOffTheHill (date,student);
            student.getMovingOffTheHills().add(temp);
            frame.getSvd().saveDate(temp,  student, level);
        }

        if(frame.getCheckBoxTable()[6].isSelected())
        {
            level.copy(student);
            level.setStudent(student);
            level.setOvertaking(selectLevel.selectLevel(frame.getSelectedLevel()[6]));
            student.setLevel(level);
           Overtaking temp = new Overtaking(date,student);
            student.getOvertaking().add(temp);
            frame.getSvd().saveDate(temp,  student, level);
        }

        if(frame.getCheckBoxTable()[7].isSelected())
        {
            level.copy(student);
            level.setStudent(student);
            level.setParallelParking(selectLevel.selectLevel(frame.getSelectedLevel()[7]));
            student.setLevel(level);
           ParallelParking temp = new ParallelParking(date,student);
            student.getParallelParking().add(temp);
            frame.getSvd().saveDate(temp,  student, level);
        }

        if(frame.getCheckBoxTable()[8].isSelected())
        {
            level.copy(student);
            level.setStudent(student);
            level.setParkingOblique(selectLevel.selectLevel(frame.getSelectedLevel()[8]));
            student.setLevel(level);
            ParkingOblique temp = new ParkingOblique(date,student);
            student.getParkingOblique().add(temp);
            frame.getSvd().saveDate(temp,  student, level);
        }

        if(frame.getCheckBoxTable()[9].isSelected())
        {
            level.copy(student);
            level.setStudent(student);
            level.setPerpendicularParking(selectLevel.selectLevel(frame.getSelectedLevel()[9]));
            student.setLevel(level);
            PerpendicularParking temp = new PerpendicularParking(date,student);
            student.getPerpendicularParking().add(temp);
            frame.getSvd().saveDate(temp,  student, level);
        }

        if(frame.getCheckBoxTable()[10].isSelected())
        {
            level.copy(student);
            level.setStudent(student);
            level.setRecirculationOfAnInfrastructure(selectLevel.selectLevel(frame.getSelectedLevel()[10]));
            student.setLevel(level);
            RecirculationOfAnInfrastructure temp = new RecirculationOfAnInfrastructure(date,student);
            student.getRecirculationOfAnInfrastructure().add(temp);
            frame.getSvd().saveDate(temp,  student, level);
        }

        if(frame.getCheckBoxTable()[11].isSelected())
        {
            level.copy(student);
            level.setStudent(student);
            level.setRecirculationOfThree(selectLevel.selectLevel(frame.getSelectedLevel()[11]));
            student.setLevel(level);
           RecirculationOfThree temp = new RecirculationOfThree(date,student);
            student.getRecirculationOfThree().add(temp);
            frame.getSvd().saveDate(temp,  student, level);
        }

        if(frame.getCheckBoxTable()[12].isSelected())
        {
            level.copy(student);
            level.setStudent(student);
            level.setRecyclingAtTheCrossroads(selectLevel.selectLevel(frame.getSelectedLevel()[12]));
            student.setLevel(level);
           RecyclingAtTheCrossroads temp = new RecyclingAtTheCrossroads(date,student);
            student.getRecyclingAtTheCrossroads().add(temp);
            frame.getSvd().saveDate(temp,  student, level);
        }
    }
}
