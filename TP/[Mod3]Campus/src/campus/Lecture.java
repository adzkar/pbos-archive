/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campus;

/**
 *
 * @author tayo
 */
public class Lecture {
    private String name;
    private int numOfStudent = 0, credit, max;
    private Lecturer lecture;
    private Student[] student;

    public Lecture(String name, int credit, int maxStudent) {
        this.name = name;
        this.credit = credit;
        this.student = new Student[maxStudent];
        this.max = maxStudent;
    }

    public int getMax() {
        return max;
    }

    public int getCredit() {
        return credit;
    }

    public String getName() {
        return name;
    }

    public int getNumOfStudent() {
        return numOfStudent;
    }

    public Lecturer getLecture() {
        return lecture;
    }

    public Student getStudent(int n) {
        return this.student[n];
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLecture(String name, String code) {
        this.lecture = new Lecturer(name, code);
    }
    
    public void addStudent(Student s) {
        this.student[this.numOfStudent] = s;
        this.numOfStudent++;
    }
    
    
}
