package PrototypeAndRegistryDesignPattern;

public class Student implements Prototype{

    private int age;

    private String  name;

    private String batch;

    private double averageBactchPSP;

    private  double studentPSP;


    public Student() {
    }

    public Student(Student student) {
        this.age = student.age;
        this.name = student.name;
        this.batch = student.batch;
        this.averageBactchPSP = student.averageBactchPSP;
        this.studentPSP = student.studentPSP;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getAverageBactchPSP() {
        return averageBactchPSP;
    }

    public void setAverageBactchPSP(double averageBactchPSP) {
        this.averageBactchPSP = averageBactchPSP;
    }

    public double getStudentPSP() {
        return studentPSP;
    }

    public void setStudentPSP(double studentPSP) {
        this.studentPSP = studentPSP;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
