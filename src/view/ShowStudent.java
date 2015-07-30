package view;

import database.SaveToDatabase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by janiu on 2015-07-24.
 */
public class ShowStudent extends JFrame implements ActionListener{

    private JButton bOk, bBack;
    private JComboBox cStudents;
    private String[] tab;
    private database.SaveToDatabase std;
    private String selectedStudent;
    public ShowStudent() throws HeadlessException {
        setTitle("Show Student");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(500, 300);
        setVisible(true);
        setLayout(null);


        std= new SaveToDatabase();
        tab=std.loadDateStudent();
        cStudents = new JComboBox(tab);
        add(cStudents);
        cStudents.setBounds(50, 50, 200, 20);



        bOk= new JButton("OK");
        add(bOk);
        bOk.setBounds(100,200,100,50);
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
        if(source==bOk){
            model.Student student = new model.Student();
            selectedStudent=cStudents.getSelectedItem().toString();
            JOptionPane.showMessageDialog(this, student.showStudent(this));
        }
        if(source==bBack)
        {
            dispose();
        }
    }

    public JComboBox getcStudents() {
        return cStudents;
    }

    public void setcStudents(JComboBox cStudents) {
        this.cStudents = cStudents;
    }

    public String[] getTab() {
        return tab;
    }

    public void setTab(String[] tab) {
        this.tab = tab;
    }

    public SaveToDatabase getStd() {
        return std;
    }

    public void setStd(SaveToDatabase std) {
        this.std = std;
    }

    public String getSelectedStudent() {
        return selectedStudent;
    }

    public void setSelectedStudent(String selectedStudent) {
        this.selectedStudent = selectedStudent;
    }
}
