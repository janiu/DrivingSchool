package database;

import javax.persistence.*;
import java.util.List;

/**
 * Created by janiu on 2015-07-20.
 */




@Entity
public class Student {

    @Id
    @GeneratedValue
    private int idStudent;

    private String name;
    private String surname;
    private String place;
    private int age;
    private int hours;

    @OneToMany(mappedBy = "student")
    private List<MovingOff> movingOffs;

    @OneToMany(mappedBy = "student")
    private List<Arc> arcs;

    @OneToMany(mappedBy = "student")
    private List<MovingOffTheHill> movingOffTheHills;

    @OneToMany(mappedBy = "student")
    private List<RecirculationOfThree> recirculationOfThree;

    @OneToMany(mappedBy = "student")
    private List<RecirculationOfAnInfrastructure> recirculationOfAnInfrastructure;

    @OneToMany(mappedBy = "student")
    private List<PerpendicularParking> perpendicularParking;

    @OneToMany(mappedBy = "student")
    private List<RecyclingAtTheCrossroads> recyclingAtTheCrossroads;

    @OneToMany(mappedBy = "student")
    private List<ParkingOblique> parkingOblique;

    @OneToMany(mappedBy = "student")
    private List<ParallelParking> parallelParking;

    @OneToMany(mappedBy = "student")
    private List<Overtaking> overtaking;

    @OneToMany(mappedBy = "student")
    private List<HorseRoadsOneWay> horseRoadsOneWay;

    @OneToMany(mappedBy = "student")
    private List<InhibitionAtTheSite> inhibitionAtTheSite;

    @OneToMany(mappedBy = "student")
    private List<JoinTheTraffic> joinTheTraffic;


    @OneToOne
    @JoinColumn(name = "IdLevel")
    private Level level;

    @ManyToOne
    @JoinColumn(name = "idInstructor")
    private Instructor instructor;

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<MovingOff> getMovingOffs() {
        return movingOffs;
    }

    public void setMovingOffs(List<MovingOff> movingOffs) {
        this.movingOffs = movingOffs;
    }

    public List<Arc> getArcs() {
        return arcs;
    }

    public void setArcs(List<Arc> arcs) {
        this.arcs = arcs;
    }

    public List<MovingOffTheHill> getMovingOffTheHills() {
        return movingOffTheHills;
    }

    public void setMovingOffTheHills(List<MovingOffTheHill> movingOffTheHills) {
        this.movingOffTheHills = movingOffTheHills;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Student() {
        this.hours=0;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public List<RecirculationOfThree> getRecirculationOfThree() {
        return recirculationOfThree;
    }

    public void setRecirculationOfThree(List<RecirculationOfThree> recirculationOfThree) {
        this.recirculationOfThree = recirculationOfThree;
    }

    public List<RecirculationOfAnInfrastructure> getRecirculationOfAnInfrastructure() {
        return recirculationOfAnInfrastructure;
    }

    public void setRecirculationOfAnInfrastructure(List<RecirculationOfAnInfrastructure> recirculationOfAnInfrastructure) {
        this.recirculationOfAnInfrastructure = recirculationOfAnInfrastructure;
    }

    public List<PerpendicularParking> getPerpendicularParking() {
        return perpendicularParking;
    }

    public void setPerpendicularParking(List<PerpendicularParking> perpendicularParking) {
        this.perpendicularParking = perpendicularParking;
    }

    public List<RecyclingAtTheCrossroads> getRecyclingAtTheCrossroads() {
        return recyclingAtTheCrossroads;
    }

    public void setRecyclingAtTheCrossroads(List<RecyclingAtTheCrossroads> recyclingAtTheCrossroads) {
        this.recyclingAtTheCrossroads = recyclingAtTheCrossroads;
    }

    public List<ParkingOblique> getParkingOblique() {
        return parkingOblique;
    }

    public void setParkingOblique(List<ParkingOblique> parkingOblique) {
        this.parkingOblique = parkingOblique;
    }

    public List<ParallelParking> getParallelParking() {
        return parallelParking;
    }

    public void setParallelParking(List<ParallelParking> parallelParking) {
        this.parallelParking = parallelParking;
    }

    public List<Overtaking> getOvertaking() {
        return overtaking;
    }

    public void setOvertaking(List<Overtaking> overtaking) {
        this.overtaking = overtaking;
    }

    public List<HorseRoadsOneWay> getHorseRoadsOneWay() {
        return horseRoadsOneWay;
    }

    public void setHorseRoadsOneWay(List<HorseRoadsOneWay> horseRoadsOneWay) {
        this.horseRoadsOneWay = horseRoadsOneWay;
    }

    public List<InhibitionAtTheSite> getInhibitionAtTheSite() {
        return inhibitionAtTheSite;
    }

    public void setInhibitionAtTheSite(List<InhibitionAtTheSite> inhibitionAtTheSite) {
        this.inhibitionAtTheSite = inhibitionAtTheSite;
    }

    public List<JoinTheTraffic> getJoinTheTraffic() {
        return joinTheTraffic;
    }

    public void setJoinTheTraffic(List<JoinTheTraffic> joinTheTraffic) {
        this.joinTheTraffic = joinTheTraffic;
    }
}
