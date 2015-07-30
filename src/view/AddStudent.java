package view;

import database.Instructor;
import database.SaveToDatabase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

/**
 * Created by janiu on 2015-07-21.
 */
public class AddStudent extends JFrame implements ActionListener {

    private JLabel lName, lSurname, lPlace, lAge, lInstrucotr;
    private JTextField tName, tSurname, tPlace, tAge;
    private JComboBox cInstructor;
    private JButton bOk, bBack;
    private Instructor instructor;
    private String[] tab;
    private String selectedInstructor;
    private database.SaveToDatabase std;

    public AddStudent() throws HeadlessException {
        setTitle("Add Student");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(500, 300);
        setVisible(true);
        lName = new JLabel("Name");
        lSurname = new JLabel("Surname");
        lPlace = new JLabel("Place");
        lAge = new JLabel("Age");
        lInstrucotr = new JLabel("Instructor");
        add(lName);
        add(lSurname);
        add(lPlace);
        add(lAge);
        add(lInstrucotr);
        lName.setBounds(5, 5, 50, 20);
        lSurname.setBounds(5, 40, 100, 20);
        lPlace.setBounds(5, 75, 50, 20);
        lAge.setBounds(5, 110, 50, 20);
        lInstrucotr.setBounds(5, 145, 100, 20);

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

        SaveToDatabase svd = new SaveToDatabase();
        svd.openConnectDatabase();

        instructor = new Instructor();

        tab=svd.loadDateInstructor();
        cInstructor = new JComboBox(tab);
        add(cInstructor);
        cInstructor.setBounds(100, 145, 130, 20);

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
            selectedInstructor=cInstructor.getSelectedItem().toString();
            System.out.println(selectedInstructor);
            model.Student temp = new model.Student();
            temp.setStudent(this);
            std = new database.SaveToDatabase();
            std.closeConnectDatabase();
            JOptionPane.showMessageDialog(this, "Student added");
            std.openConnectDatabase();
            dispose();
        }
        if(source==bBack)
        {
            dispose();
        }
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public String[] getTab() {
        return tab;
    }

    public void setTab(String[] tab) {
        this.tab = tab;
    }

    public String getSelectedInstructor() {
        return selectedInstructor;
    }

    public void setSelectedInstructor(String selectedInstructor) {
        this.selectedInstructor = selectedInstructor;
    }

    public SaveToDatabase getStd() {
        return std;
    }

    public void setStd(SaveToDatabase std) {
        this.std = std;
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

    public JComboBox getcInstructor() {
        return cInstructor;
    }

    public void setcInstructor(JComboBox cInstructor) {
        this.cInstructor = cInstructor;
    }
}
