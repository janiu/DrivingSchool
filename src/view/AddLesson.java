package view;



import database.SaveToDatabase;
import database.Student;
import enumation.Level;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by janiu on 2015-07-21.
 */
public class AddLesson extends JFrame implements ActionListener
{
    private JLabel lYear, lMonth, lDay, lHour, lMinute;

    private JComboBox cYear, cMonth, cDay, cHour, cMinute;

    private JCheckBox cArc, cHorseRoadsOneWay ,cInhibitionAtTheSite ,cJoinTheTraffic ,cMovingOff ,cMovingOffTheHill ,
            cOvertaking ,cParallelParking ,cParkingOblique ,cPerpendicularParking ,cRecirculationOfAnInfrastructure,
            cRecirculationOfThree , cRecyclingAtTheCrossroads;

    JCheckBox []checkBoxTable;

    JComboBox []comboBoxTable;

    JComboBox cStudent;

    private int selectedYear,  selectedDay , selectedHour , selectedMinute , selectedMonth;

    private String selectedStudent;

    private JButton bOk, bBack;

    private Integer temp;
    private String[] tab;
    private database.Student student;
    private SaveToDatabase svd;

    private String[] tabLevel;
    private String[] selectedLevel;

    public AddLesson() throws HeadlessException {
        setTitle("Add Lesson");
        setSize(700, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        selectedLevel = new String[13];
        comboBoxTable = new JComboBox[13];
        Integer [] years={2015,2016,2017,2018,2019,2020,2021,2022,2023,2024,2025,2026};
        Integer [] months={1,2,3,4,5,6,7,8,9,10,11,12};
        Integer [] days = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
        Integer [] hours = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
        Integer[] minutes = new Integer[60];
        for(Integer i=0 ; i<60 ; i++)
            minutes[i] = i ;



        lYear= new JLabel("Year");                              //Napisy
        lMonth = new JLabel("Month");
        lDay = new JLabel("Day");
        lHour = new JLabel("Hour");
        lMinute = new JLabel("Minute");
        lYear.setBounds(20, 20, 100, 20);
        lMonth.setBounds(20, 50, 100, 20);
        lDay.setBounds(20, 80, 100, 20);
        lHour.setBounds(20, 110, 100, 20);
        lMinute.setBounds(20, 140, 100, 20);
        add(lYear);
        add(lMonth);
        add(lDay);
        add(lHour);
        add(lMinute);

        cYear = new JComboBox(years);                            //Listy wyborow
        cMonth = new JComboBox(months);
        cDay = new JComboBox(days);
        cHour = new JComboBox(hours);
        cMinute = new JComboBox(minutes);
        add(cYear);
        add(cMonth);
        add(cDay);
        add(cHour);
        add(cMinute);
        cYear.setBounds(120, 20, 100, 20);
        cMonth.setBounds(120, 50, 100, 20);
        cDay.setBounds(120, 80, 100, 20);
        cHour.setBounds(120, 110, 100, 20);
        cMinute.setBounds(120, 140, 100, 20);

       
        cArc= new JCheckBox("Arc", false);
        add(cArc);
        cArc.setBounds(250, 20, 150, 20);
        cHorseRoadsOneWay = new JCheckBox("HorseRoadsOneWay", false);
        add(cHorseRoadsOneWay);
        cHorseRoadsOneWay.setBounds(250, 50, 150, 20);
        cInhibitionAtTheSite= new JCheckBox("InhibitionAtTheSite", false);
        add(cInhibitionAtTheSite);
        cInhibitionAtTheSite.setBounds(250, 80, 150, 20);
        cJoinTheTraffic= new JCheckBox("JoinTheTraffic", false);
        add(cJoinTheTraffic);
        cJoinTheTraffic.setBounds(250, 110, 150, 20);
        cMovingOff = new JCheckBox("MovingOff", false);
        add(cMovingOff);
        cMovingOff.setBounds(250, 140, 150, 20);
        cMovingOffTheHill = new JCheckBox("MovingOffTheHill ", false);
        add(cMovingOffTheHill);
        cMovingOffTheHill.setBounds(250, 170, 150, 20);
        cOvertaking = new JCheckBox("Overtaking", false);
        add(cOvertaking);
        cOvertaking.setBounds(250, 200, 150, 20);
        cParallelParking = new JCheckBox("ParallelParking", false);
        add(cParallelParking);
        cParallelParking.setBounds(250, 230, 150, 20);
        cParkingOblique = new JCheckBox("ParkingOblique", false);
        add(cParkingOblique);
        cParkingOblique.setBounds(250, 260, 150, 20);
        cPerpendicularParking = new JCheckBox("PerpendicularParking", false);
        add(cPerpendicularParking);
        cPerpendicularParking.setBounds(250, 290, 150, 20);
        cRecirculationOfAnInfrastructure = new JCheckBox("RecirculationOfAnInfrastructure", false);
        add(cRecirculationOfAnInfrastructure);
        cRecirculationOfAnInfrastructure.setBounds(250, 320, 200, 20);
        cRecirculationOfThree = new JCheckBox("RecirculationOfThree", false);
        add(cRecirculationOfThree);
        cRecirculationOfThree.setBounds(250, 350, 150, 20);
        cRecyclingAtTheCrossroads = new JCheckBox("RecyclingAtTheCrossroads", false);
        add(cRecyclingAtTheCrossroads);
        cRecyclingAtTheCrossroads.setBounds(250, 380, 200, 20);
         JCheckBox []temp={cArc, cHorseRoadsOneWay ,cInhibitionAtTheSite ,cJoinTheTraffic ,cMovingOff ,cMovingOffTheHill ,
                cOvertaking ,cParallelParking ,cParkingOblique ,cPerpendicularParking ,cRecirculationOfAnInfrastructure,
                cRecirculationOfThree , cRecyclingAtTheCrossroads};
        checkBoxTable=temp;

        tabLevel = new String[4];
        tabLevel[0]= "POORLY";
        tabLevel[1]= "MIDDING";
        tabLevel[2]= "WELL";
        tabLevel[3]= "GREAT";

        for(int i=0 , y=20; i<13; i++, y=y+30)
        {
            comboBoxTable[i] = new JComboBox(tabLevel);
            add(comboBoxTable[i]);
            comboBoxTable[i].setBounds(470,y,100,20);
        }

        svd=new SaveToDatabase();
        tab=svd.loadDateStudent();

        cStudent = new JComboBox(tab);
        add(cStudent);
        cStudent.setBounds(20,200,100,20);



        bOk = new JButton("OK");
        bOk.setBounds(100, 250, 100, 50);
        add(bOk);
        bOk.setForeground(Color.BLACK);
        bOk.addActionListener(this);

        bBack = new JButton("Back");
        bBack.setBounds(100,350,100,50);
        add(bBack);
        bBack.setForeground(Color.BLACK);
        bBack.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if(source==bOk)
        {
            for(int i=0 ; i<13 ; i++)
            {
               selectedLevel[i]=comboBoxTable[i].getSelectedItem().toString();

            }

           selectedStudent=cStudent.getSelectedItem().toString();
            selectedYear=Integer.parseInt(cYear.getSelectedItem().toString());
            selectedMonth =Integer.parseInt(cMonth.getSelectedItem().toString());
            selectedDay=Integer.parseInt(cDay.getSelectedItem().toString());
            selectedHour=Integer.parseInt(cHour.getSelectedItem().toString());
            selectedMinute=Integer.parseInt(cDay.getSelectedItem().toString());



//            selectedLevelMovingOff = cMovingOff.getSelectedItem().toString();
//            selectedLevelArc = cArc.getSelectedItem().toString();
//            selectedLevelMovingOffTheHill=cMovingOffTheHill.getSelectedItem().toString();

            model.Date temp = new model.Date();
//            temp.createListDate(this);
            temp.setDate(this);
//
            JOptionPane.showMessageDialog(this, "Lesson added");
            dispose();
        }
//        if(source==bBack){
//            dispose();
//        }
    }


    public SaveToDatabase getSvd() {
        return svd;
    }

    public void setSvd(SaveToDatabase svd) {
        this.svd = svd;
    }

    public String[] getTab() {
        return tab;
    }

    public void setTab(String[] tab) {
        this.tab = tab;
    }

    public String getSelectedStudent() {
        return selectedStudent;
    }

    public void setSelectedStudent(String selectedStudent) {
        this.selectedStudent = selectedStudent;
    }

    public int getSelectedMonth() {
        return selectedMonth;
    }

    public void setSelectedMonth(int selectedMonth) {
        this.selectedMonth = selectedMonth;
    }

    public int getSelectedMinute() {
        return selectedMinute;
    }

    public void setSelectedMinute(int selectedMinute) {
        this.selectedMinute = selectedMinute;
    }

    public int getSelectedHour() {
        return selectedHour;
    }

    public void setSelectedHour(int selectedHour) {
        this.selectedHour = selectedHour;
    }

    public int getSelectedDay() {
        return selectedDay;
    }

    public void setSelectedDay(int selectedDay) {
        this.selectedDay = selectedDay;
    }

    public int getSelectedYear() {
        return selectedYear;
    }

    public void setSelectedYear(int selectedYear) {
        this.selectedYear = selectedYear;
    }

    public JCheckBox[] getCheckBoxTable() {
        return checkBoxTable;
    }

    public void setCheckBoxTable(JCheckBox[] checkBoxTable) {
        this.checkBoxTable = checkBoxTable;
    }

    public String[] getSelectedLevel() {
        return selectedLevel;
    }

    public void setSelectedLevel(String[] selectedLevel) {
        this.selectedLevel = selectedLevel;
    }

    public String[] getTabLevel() {
        return tabLevel;
    }

    public void setTabLevel(String[] tabLevel) {
        this.tabLevel = tabLevel;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    public JButton getbBack() {
        return bBack;
    }

    public void setbBack(JButton bBack) {
        this.bBack = bBack;
    }

    public JButton getbOk() {
        return bOk;
    }

    public void setbOk(JButton bOk) {
        this.bOk = bOk;
    }

    public JComboBox getcStudent() {
        return cStudent;
    }

    public void setcStudent(JComboBox cStudent) {
        this.cStudent = cStudent;
    }

    public JComboBox[] getComboBoxTable() {
        return comboBoxTable;
    }

    public void setComboBoxTable(JComboBox[] comboBoxTable) {
        this.comboBoxTable = comboBoxTable;
    }

    public JCheckBox getcRecyclingAtTheCrossroads() {
        return cRecyclingAtTheCrossroads;
    }

    public void setcRecyclingAtTheCrossroads(JCheckBox cRecyclingAtTheCrossroads) {
        this.cRecyclingAtTheCrossroads = cRecyclingAtTheCrossroads;
    }

    public JCheckBox getcRecirculationOfThree() {
        return cRecirculationOfThree;
    }

    public void setcRecirculationOfThree(JCheckBox cRecirculationOfThree) {
        this.cRecirculationOfThree = cRecirculationOfThree;
    }

    public JCheckBox getcRecirculationOfAnInfrastructure() {
        return cRecirculationOfAnInfrastructure;
    }

    public void setcRecirculationOfAnInfrastructure(JCheckBox cRecirculationOfAnInfrastructure) {
        this.cRecirculationOfAnInfrastructure = cRecirculationOfAnInfrastructure;
    }

    public JCheckBox getcPerpendicularParking() {
        return cPerpendicularParking;
    }

    public void setcPerpendicularParking(JCheckBox cPerpendicularParking) {
        this.cPerpendicularParking = cPerpendicularParking;
    }

    public JCheckBox getcParkingOblique() {
        return cParkingOblique;
    }

    public void setcParkingOblique(JCheckBox cParkingOblique) {
        this.cParkingOblique = cParkingOblique;
    }

    public JCheckBox getcParallelParking() {
        return cParallelParking;
    }

    public void setcParallelParking(JCheckBox cParallelParking) {
        this.cParallelParking = cParallelParking;
    }

    public JCheckBox getcOvertaking() {
        return cOvertaking;
    }

    public void setcOvertaking(JCheckBox cOvertaking) {
        this.cOvertaking = cOvertaking;
    }

    public JCheckBox getcMovingOffTheHill() {
        return cMovingOffTheHill;
    }

    public void setcMovingOffTheHill(JCheckBox cMovingOffTheHill) {
        this.cMovingOffTheHill = cMovingOffTheHill;
    }

    public JCheckBox getcMovingOff() {
        return cMovingOff;
    }

    public void setcMovingOff(JCheckBox cMovingOff) {
        this.cMovingOff = cMovingOff;
    }

    public JCheckBox getcJoinTheTraffic() {
        return cJoinTheTraffic;
    }

    public void setcJoinTheTraffic(JCheckBox cJoinTheTraffic) {
        this.cJoinTheTraffic = cJoinTheTraffic;
    }

    public JCheckBox getcInhibitionAtTheSite() {
        return cInhibitionAtTheSite;
    }

    public void setcInhibitionAtTheSite(JCheckBox cInhibitionAtTheSite) {
        this.cInhibitionAtTheSite = cInhibitionAtTheSite;
    }

    public JCheckBox getcHorseRoadsOneWay() {
        return cHorseRoadsOneWay;
    }

    public void setcHorseRoadsOneWay(JCheckBox cHorseRoadsOneWay) {
        this.cHorseRoadsOneWay = cHorseRoadsOneWay;
    }

    public JCheckBox getcArc() {
        return cArc;
    }

    public void setcArc(JCheckBox cArc) {
        this.cArc = cArc;
    }

    public JComboBox getcMinute() {
        return cMinute;
    }

    public void setcMinute(JComboBox cMinute) {
        this.cMinute = cMinute;
    }

    public JComboBox getcHour() {
        return cHour;
    }

    public void setcHour(JComboBox cHour) {
        this.cHour = cHour;
    }

    public JComboBox getcDay() {
        return cDay;
    }

    public void setcDay(JComboBox cDay) {
        this.cDay = cDay;
    }

    public JComboBox getcMonth() {
        return cMonth;
    }

    public void setcMonth(JComboBox cMonth) {
        this.cMonth = cMonth;
    }

    public JComboBox getcYear() {
        return cYear;
    }

    public void setcYear(JComboBox cYear) {
        this.cYear = cYear;
    }
}