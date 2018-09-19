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
public class MainDepartment {
    public static void main(String[] args) {
        Employee e1 = new Employee("Michael", 533221, 7500000);
        Employee e2 = new Employee("Daisy", 833221, 5800000);
        Department d = new Department("Public Relation", 20);
        d.addEmployee(e1);
        d.addEmployee(e2);
        System.out.println("Department info");
        System.out.println("Dept name: "+d.getName());
        System.out.println("Dept employee:");
//        for (int i = 0; i < d.getNumOfEmployee(); i++) {
//            System.out.println("Employe num-"+(i+1));
//            System.out.println("Name: "+d.getEmployee(i).getName(0));
//            System.out.println("id: "+d.getEmployee(i).getId(0));
//            System.out.println("Name: "+d.getEmployee(i).getSalary(0));
//        }
        d = null;
        System.out.println("Employee num-1");
        System.out.println("Name: "+e1.getName());
        System.out.println("Id: "+e1.getId());
        System.out.println("Salary: "+e1.getSalary());
        System.out.println("Employee num-2");
        System.out.println("Name: "+e2.getName());
        System.out.println("Id: "+e2.getId());
        System.out.println("Salary: "+e2.getSalary());
    }
}
