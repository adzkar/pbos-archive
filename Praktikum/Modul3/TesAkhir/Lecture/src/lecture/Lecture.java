/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture;

/**
 *
 * @author PRAKTIKAN
 */
public class Lecture {

    /**
     * @param args the command line arguments
     */
    
    private String name;
    private Lecture lecture;
    private Student[] student;
    private int numOfStudent, credit;
    
    public Lecture(String name, int credit,int maxStudent) {
        this.name = name;
        this.credit = credit;
        this.student = new Student[maxStudent];
    }

    public String getName() {
        return name;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public Student[] getStudent(int n) {
        return student[n];
    }

    public int getNumOfStudent() {
        return numOfStudent;
    }

    public int getCredit() {
        return credit;
    }

    
    
    public void setName(String name) {
        this.name = name;
    }

    public void setLecturer(String name, String code) {
        this.lecture = new Lecture(name, credit, numOfStudent);
    }
    
    public void addStudent(Student s) {
        int i = 0;
        while((this.student[i] != null) && (i < this.student.length)) i++;
        this.student[i] = s;
    }
    
    
}
