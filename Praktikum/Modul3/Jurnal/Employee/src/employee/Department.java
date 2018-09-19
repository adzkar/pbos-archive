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
public class Department {
    private String name;
    private int numOfEmployee;
    private Employee[] employee;

    public Department(String name, int maxEmployee) {
        this.name = name;
        employee = new Employee[maxEmployee];
    }

    public String getName() {
        return name;
    }

    public int getNumOfEmployee() {
        return numOfEmployee;
    }

    public Employee[] getEmployee() {
        return employee;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addEmployee(Employee e) {
        if (numOfEmployee < employee.length) {
            employee[numOfEmployee] = e;
            numOfEmployee++;
        } else System.out.println("Sorry, can not add new employee");
    }
    
}
