/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author PRAKTIKAN
 */
public class Employee {

    /**
     * @param args the command line arguments
     */
    private String name;
    private long idEmployee;
    private double salary;

    public Employee(String name, long idEmployee, double salary) {
        this.name = name;
        this.idEmployee = idEmployee;
        this.salary = salary;
    }
    public Employee(String name, long idEmployee) {
        this.name = name;
        this.idEmployee = idEmployee;
    }
    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return idEmployee;
    }

    public void setIdEmployee(long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    
}
