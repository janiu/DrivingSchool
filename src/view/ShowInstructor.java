package view;

import database.SaveToDatabase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by janiu on 2015-07-24.
 */
public class ShowInstructor extends JFrame implements ActionListener {
    private JButton bOk, bBack;
    private JComboBox cInstrctors;
    private String[] tab;
    private database.SaveToDatabase std;
    private String selectedInstructor;

    public ShowInstructor() throws HeadlessException {
        setTitle("Show Instructor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(500, 300);
        setVisible(true);
        setLayout(null);


        std= new SaveToDatabase();
        tab=std.loadDateInstructor();
        cInstrctors = new JComboBox(tab);
        add(cInstrctors);
        cInstrctors.setBounds(50, 50, 200, 20);



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
            model.Instructor instructor = new model.Instructor();
            selectedInstructor=cInstrctors.getSelectedItem().toString();
            JOptionPane.showMessageDialog(this, instructor.showInstructor(this));
        }
        if(source==bBack)
        {
            dispose();
        }
    }

    public JComboBox getcInstrctors() {
        return cInstrctors;
    }

    public void setcInstrctors(JComboBox cInstrctors) {
        this.cInstrctors = cInstrctors;
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

    public String getSelectedInstructor() {
        return selectedInstructor;
    }

    public void setSelectedInstructor(String selectedInstructor) {
        this.selectedInstructor = selectedInstructor;
    }
}
