package view;

import database.SaveToDatabase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by janiu on 2015-07-22.
 */

public class Menu extends JFrame implements ActionListener{
    JButton bAddInstructor, bAddStudent, bAddLesson, bShowStudent, bShowInstructor;
    database.SaveToDatabase std;

    public Menu() throws HeadlessException {
        setTitle("Menu");
        std = new SaveToDatabase();
        std.openConnectDatabase();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(500, 500);
        setVisible(true);
        setLayout(null);
        bAddInstructor= new JButton("Add Instructor");
        bAddStudent = new JButton("Add Student");
        bAddLesson = new JButton("Add Lesson");
        bShowStudent = new JButton("Show Student");
        bShowInstructor = new JButton("Show Instructor");
        add(bAddInstructor);
        add(bAddStudent);
        add(bAddLesson);
        add(bShowStudent);
        add(bShowInstructor);
        bAddInstructor.setBounds(150, 20, 200, 50);
        bAddStudent.setBounds(150, 90, 200, 50);
        bAddLesson.setBounds(150, 160, 200, 50);
        bShowStudent.setBounds(150,230,200,50);
        bShowInstructor.setBounds(150, 300, 200, 50);
        bAddInstructor.addActionListener(this);
        bAddStudent.addActionListener(this);
        bAddLesson.addActionListener(this);
        bShowStudent.addActionListener(this);
        bShowInstructor.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source==bAddInstructor){
            AddInstructor addInstructor = new AddInstructor();
        }
        if(source==bAddStudent){
            AddStudent addStudent = new AddStudent();
        }
        if(source==bAddLesson){
            AddLesson addLesson = new AddLesson();
        }
        if (source==bShowStudent)
        {
            ShowStudent showStudent = new ShowStudent();
        }
        if (source==bShowInstructor)
        {
            ShowInstructor showInstructor = new ShowInstructor();
        }

    }

    public SaveToDatabase getStd() {
        return std;
    }

    public void setStd(SaveToDatabase std) {
        this.std = std;
    }
}
