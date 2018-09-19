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
public class MainEmployee {
    public static void main(String[] args) {
        Employee e = new Employee("Michael", 533221, 7500000);
        System.out.println("Employee 1");
        System.out.println("Employee name: "+e.getName());
        System.out.println("Employee name: "+e.getId());
        System.out.println("Employee name: "+e.getSalary());
        Employee f = new Employee("Daisy", 734321);
        f.setSalary(67000000);
        System.out.println("Employee 2");
        System.out.println("name: "+f.getName());
        System.out.println("Id: "+f.getId());
        System.out.println("Salary: "+f.getSalary());
    }
}
