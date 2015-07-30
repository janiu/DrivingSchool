package database;

import javax.persistence.*;

/**
 * Created by janiu on 2015-07-21.
 */
@Entity
public class Level {                            //poziomy wszystkich umiejêtnosci
    @Id
    @GeneratedValue
    int idLevel;

    private enumation.Level arc;
    private enumation.Level movingOff;
    private enumation.Level movingOffTheHill;
    private enumation.Level horseRoadsOneWay;
    private enumation.Level inhibitionAtTheSite;
    private enumation.Level joinTheTraffic;
    private enumation.Level overtaking;
    private enumation.Level parallelParking;
    private enumation.Level parkingOblique;
    private enumation.Level perpendicularParking;
    private enumation.Level recirculationOfAnInfrastructure;
    private enumation.Level recirculationOfThree;
    private enumation.Level recyclingAtTheCrossroads;

    @OneToOne(mappedBy = "level")
    private Student student;

    @Enumerated(EnumType.STRING)
    public enumation.Level getArc() {
        return arc;
    }
    @Enumerated(EnumType.STRING)
    public void setArc(enumation.Level arc) {
        this.arc = arc;
    }
    @Enumerated(EnumType.STRING)
    public enumation.Level getMovingOff() {
        return movingOff;
    }
    @Enumerated(EnumType.STRING)
    public void setMovingOff(enumation.Level movingOff) {
        this.movingOff = movingOff;
    }
    @Enumerated(EnumType.STRING)
    public enumation.Level getMobingOffTheHill() {
        return movingOffTheHill;
    }
    @Enumerated(EnumType.STRING)
    public void setMobingOffTheHill(enumation.Level mobingOffTheHill) {
        this.movingOffTheHill = mobingOffTheHill;
    }
    @Enumerated(EnumType.STRING)
    public enumation.Level getMovingOffTheHill() {
        return movingOffTheHill;
    }
    @Enumerated(EnumType.STRING)
    public void setMovingOffTheHill(enumation.Level movingOffTheHill) {
        this.movingOffTheHill = movingOffTheHill;
    }
    @Enumerated(EnumType.STRING)
    public enumation.Level getHorseRoadsOneWay() {
        return horseRoadsOneWay;
    }
    @Enumerated(EnumType.STRING)
    public void setHorseRoadsOneWay(enumation.Level horseRoadsOneWay) {
        this.horseRoadsOneWay = horseRoadsOneWay;
    }
    @Enumerated(EnumType.STRING)
    public enumation.Level getInhibitionAtTheSite() {
        return inhibitionAtTheSite;
    }
    @Enumerated(EnumType.STRING)
    public void setInhibitionAtTheSite(enumation.Level inhibitionAtTheSite) {
        this.inhibitionAtTheSite = inhibitionAtTheSite;
    }
    @Enumerated(EnumType.STRING)
    public enumation.Level getJoinTheTraffic() {
        return joinTheTraffic;
    }
    @Enumerated(EnumType.STRING)
    public void setJoinTheTraffic(enumation.Level joinTheTraffic) {
        this.joinTheTraffic = joinTheTraffic;
    }
    @Enumerated(EnumType.STRING)
    public enumation.Level getOvertaking() {
        return overtaking;
    }
    @Enumerated(EnumType.STRING)
    public void setOvertaking(enumation.Level overtaking) {
        this.overtaking = overtaking;
    }
    @Enumerated(EnumType.STRING)
    public enumation.Level getParallelParking() {
        return parallelParking;
    }
    @Enumerated(EnumType.STRING)
    public void setParallelParking(enumation.Level parallelParking) {
        this.parallelParking = parallelParking;
    }
    @Enumerated(EnumType.STRING)
    public enumation.Level getParkingOblique() {
        return parkingOblique;
    }
    @Enumerated(EnumType.STRING)
    public void setParkingOblique(enumation.Level parkingOblique) {
        this.parkingOblique = parkingOblique;
    }
    @Enumerated(EnumType.STRING)
    public enumation.Level getPerpendicularParking() {
        return perpendicularParking;
    }
    @Enumerated(EnumType.STRING)
    public void setPerpendicularParking(enumation.Level perpendicularParking) {
        this.perpendicularParking = perpendicularParking;
    }
    @Enumerated(EnumType.STRING)
    public enumation.Level getRecirculationOfAnInfrastructure() {
        return recirculationOfAnInfrastructure;
    }
    @Enumerated(EnumType.STRING)
    public void setRecirculationOfAnInfrastructure(enumation.Level recirculationOfAnInfrastructure) {
        this.recirculationOfAnInfrastructure = recirculationOfAnInfrastructure;
    }
    @Enumerated(EnumType.STRING)
    public enumation.Level getRecirculationOfThree() {
        return recirculationOfThree;
    }
    @Enumerated(EnumType.STRING)
    public void setRecirculationOfThree(enumation.Level recirculationOfThree) {
        this.recirculationOfThree = recirculationOfThree;
    }
    @Enumerated(EnumType.STRING)
    public enumation.Level getRecyclingAtTheCrossroads() {
        return recyclingAtTheCrossroads;
    }
    @Enumerated(EnumType.STRING)
    public void setRecyclingAtTheCrossroads(enumation.Level recyclingAtTheCrossroads) {
        this.recyclingAtTheCrossroads = recyclingAtTheCrossroads;
    }

    public Level() {
        this.movingOff = enumation.Level.POORLY;
        this.movingOffTheHill = enumation.Level.POORLY;
        this.arc = enumation.Level.POORLY;
        this.horseRoadsOneWay= enumation.Level.POORLY;
        this.inhibitionAtTheSite= enumation.Level.POORLY;
        this.joinTheTraffic= enumation.Level.POORLY;
        this.overtaking= enumation.Level.POORLY;
        this.parallelParking= enumation.Level.POORLY;
        this.parkingOblique= enumation.Level.POORLY;
        this.perpendicularParking= enumation.Level.POORLY;
        this.recirculationOfAnInfrastructure= enumation.Level.POORLY;
        this.recirculationOfThree= enumation.Level.POORLY;
        this.recyclingAtTheCrossroads= enumation.Level.POORLY;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void copy(Student student)
    {
        this.setArc(student.getLevel().getArc());
        this.setMovingOff(student.getLevel().getMovingOff());
        this.setMovingOffTheHill(student.getLevel().getMovingOffTheHill());
        this.setHorseRoadsOneWay(student.getLevel().getHorseRoadsOneWay());
        this.setInhibitionAtTheSite(student.getLevel().getInhibitionAtTheSite());
        this.setJoinTheTraffic(student.getLevel().getJoinTheTraffic());
        this.setOvertaking(student.getLevel().getOvertaking());
        this.setParallelParking(student.getLevel().getParallelParking());
        this.setParkingOblique(student.getLevel().getParkingOblique());
        this.setPerpendicularParking(student.getLevel().getPerpendicularParking());
        this.setRecirculationOfAnInfrastructure(student.getLevel().getRecirculationOfAnInfrastructure());
        this.setRecirculationOfThree(student.getLevel().getRecirculationOfThree());
        this.setRecyclingAtTheCrossroads(student.getLevel().getRecyclingAtTheCrossroads());
    }

}
