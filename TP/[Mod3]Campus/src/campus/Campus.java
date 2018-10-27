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
public class Campus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lecture l = new Lecture("Calculus", 3, 45);
        System.out.println("Lecture: ");
        System.out.println("Name: "+l.getName());
        System.out.println("Credit: "+l.getCredit());
        System.out.println("maxStudent: "+l.getMax());
        System.out.println("Lecturer");
        l.setLecture("Max Steel", "MXS");
        System.out.println("Name: "+l.getLecture().getName());
        System.out.println("Code: "+l.getLecture().getCode());
        l.addStudent(new Student("Bobby", 12341));
        l.addStudent(new Student("Suzy", 12341));
        l.addStudent(new Student("Andrew", 12341));
        l.addStudent(new Student("Briant", 12341));
        l.addStudent(new Student("Cobi", 12341));
        for (int i = 0; i < l.getNumOfStudent(); i++) {
            System.out.println("Name: "+l.getStudent(i).getName()+" id: "+l.getStudent(i).getId());
        }
    }
    
}
