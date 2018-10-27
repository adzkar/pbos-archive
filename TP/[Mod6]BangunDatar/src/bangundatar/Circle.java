/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author tayo
 */
public class Circle implements Shape {

    private double jari2;

    public Circle(double jari2) {
        this.jari2 = jari2;
    }
    
    
    @Override
    public double hitungLuas() {
        return this.jari2*this.jari2*PI;
    }
    
}
