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
public class Student {
    private String name;
    private long idStudent;

    public Student(String name, long id) {
        this.name = name;
        this.idStudent = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return idStudent;
    }

    public void setId(long idStudent) {
        this.idStudent = idStudent;
    }
    
}
