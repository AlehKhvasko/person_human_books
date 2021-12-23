package projectsHandsOn.AdvancedOOP.animals.humanBooksPerson;

import java.util.Date;

public class Student extends Person{
    private String name;
    private boolean enrolled = false;
    private double  semesterFee;
    private int matriculation;

    public Student(String name){
        super(name);
    }

    public Student(String name, String sex, Date birthday){
        super(name, sex, birthday);
    }

    public Student(String name, int matriculation){
        super(name);
        setName(name);
        if (matriculation > 0){
            enrolled = true;
        }
    }

    public Student(String name, int matriculation, double semesterFee) {
        super(name);
        setName(name);
        setMatriculation(matriculation);
        setSemesterFee(semesterFee);
    }

    public Student(String name, int matriculation, double semesterFee, int semesterFees) {
        this(name, matriculation,semesterFee);
        this.setFee();
    }


    public String getName() {
        return name;
    }

    public boolean isEnrolled() {
        return enrolled;
    }

    public double getSemesterFee() {
        return semesterFee;
    }

    public int getMatriculation() {
        return matriculation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnrolled(boolean enrolled) {
        this.enrolled = enrolled;
    }

    public void setSemesterFee(double semesterFee) {
        if (semesterFee > 0 && semesterFee <10000){
            this.semesterFee = semesterFee;
        }
        System.out.println("Error");
    }

    public void setMatriculation(int matriculation) {
        this.matriculation = matriculation;
    }

    public void setFee() {
        this.semesterFee = 300;
    }

    public void setFee(double semesterFee) {
        this.semesterFee = semesterFee;
    }
}
