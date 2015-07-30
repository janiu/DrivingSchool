package model;


import view.AddInstructor;
import view.ShowInstructor;


/**
 * Created by janiu on 2015-07-22.
 */
public class Instructor {

    public void setInstructor(AddInstructor frame) {
        frame.getInstructor().setName(frame.gettName().getText());
        frame.getInstructor().setSurname(frame.gettSurname().getText());
        frame.getInstructor().setAge(Integer.parseInt(frame.gettAge().getText()));
        frame.getStb().saveDate(frame.getInstructor());
    }

    public String showInstructor(ShowInstructor frame) {
        String text = "";
        database.Instructor instructor;
        int indeks = 0;

        for (int i = 0; i < frame.getTab().length; i++) {
            if (frame.getTab()[i] == frame.getSelectedInstructor()) {
                indeks = i;
                indeks = indeks + 1;
            }
        }

        instructor = frame.getStd().findInstructorById(indeks);

        text = "Name: " + instructor.getName() + "\nSurname: " + instructor.getSurname() + "\nPlace: " +"\nAge: " + instructor.getAge()
                + "\nStudents: \n";

        for(database.Student x : instructor.getStudents()) {

            text=text+" - "+x.getName()+" "+x.getSurname()+"\n";
        }
        return text;
    }

}
