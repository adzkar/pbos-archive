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
public class MainProgram {
    public static void main(String[] args) {
        Lecture l = new Lecture("Calculus", 3, 45);
        System.out.println("Name: "+l.getName());
        System.out.println("Credit: "+l.getCredit());
        System.out.println("maxStudent: "+l.getNumOfStudent());
        Lecturer le = new Lecturer("Max Steel", "MXS");
        System.out.println("Name: "+le.getName());
        System.out.println("Code: "+le.getCode());
        Student s1 = new Student("Bobby", 12341);
        Student s2 = new Student("Suzy", 12341);
        Student s3 = new Student("Andrew", 12341);
        Student s4 = new Student("Briant", 12341);
        Student s5 = new Student("Cobi", 12341);
        l.addStudent(s1);
        l.addStudent(s2);
        l.addStudent(s3);
        l.addStudent(s4);
        l.addStudent(s5);
        for (int i = 0; i < l.getNumOfStudent(); i++) {
            System.out.println("Name: "+l.getStudent(i).getName());
        }
    }
}
