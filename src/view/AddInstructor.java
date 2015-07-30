package view;

import database.Instructor;
import database.SaveToDatabase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by janiu on 2015-07-22.
 */
public class AddInstructor extends JFrame implements ActionListener {
    private JLabel lName, lSurname, lPlace, lAge;
    private JTextField tName, tSurname, tPlace, tAge;
    private JButton bOk, bBack;
    private SaveToDatabase stb;
    private database.Instructor instructor;
    private database.SaveToDatabase std;

    public AddInstructor() {

        std = new SaveToDatabase();
        instructor = new database.Instructor();
        setTitle("Add Instructor");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(500, 300);
        setVisible(true);
        lName = new JLabel("Name");
        lSurname = new JLabel("Surname");
        lPlace = new JLabel("Place");
        lAge = new JLabel("Age");

        add(lName);
        add(lSurname);
        add(lPlace);
        add(lAge);

        lName.setBounds(5, 5, 50, 20);
        lSurname.setBounds(5, 40, 100, 20);
        lPlace.setBounds(5, 75, 50, 20);
        lAge.setBounds(5, 110, 50, 20);

        tName = new JTextField("");
        tSurname = new JTextField("");
        tPlace = new JTextField("");
        tAge = new JTextField("");
        add(tName);
        add(tSurname);
        add(tPlace);
        add(tAge);
        tName.setBounds(100, 5, 100, 20);
        tSurname.setBounds(100, 40, 100, 20);
        tPlace.setBounds(100, 75, 100, 20);
        tAge.setBounds(100, 110, 100, 20);

        bOk = new JButton("OK");
        bOk.setBounds(100, 200, 100, 50);
        add(bOk);
        bOk.setForeground(Color.BLACK);
        bOk.addActionListener(this);

        bBack = new JButton("Back");
        bBack.setBounds(200,200,100,50);
        add(bBack);
        bBack.setForeground(Color.BLACK);
        bBack.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source==bOk)
        {
            model.Instructor instructor = new model.Instructor();
            instructor.setInstructor(this);

            std.closeConnectDatabase();
            JOptionPane.showMessageDialog(this, "Instructor added");
            std.openConnectDatabase();
            dispose();





        }
        if(source==bBack)
        {
            dispose();
        }
    }

    public SaveToDatabase getStb() {
        return stb;
    }

    public void setStb(SaveToDatabase stb) {
        this.stb = stb;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public JTextField gettName() {

        return tName;
    }

    public void settName(JTextField tName) {
        this.tName = tName;
    }

    public JTextField gettSurname() {
        return tSurname;
    }

    public void settSurname(JTextField tSurname) {
        this.tSurname = tSurname;
    }

    public JTextField gettPlace() {
        return tPlace;
    }

    public void settPlace(JTextField tPlace) {
        this.tPlace = tPlace;
    }

    public JTextField gettAge() {
        return tAge;
    }

    public void settAge(JTextField tAge) {
        this.tAge = tAge;
    }
}
