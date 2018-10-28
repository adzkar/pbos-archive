/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kebunbinatang;

import java.util.*; 
/**
 *
 * @author tayo
 */
public class KebunBinatang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Animal> animals = new ArrayList<Animal> ();
        Animal a1 = new Bird(),a2 = new Cat(),a3 = new Fish();
        animals.add(a1);
        animals.add(a2);
        animals.add(a3);
//        for(int i = 0;i < animals.size();i++) {
//            System.out.println("Name");
//            animals.get(i).showName();
//            System.out.println("Move");
//            animals.get(i).move();
//        }
        for(Animal a : animals) {
            a.showName();
            a.move();
        }    
    }
    
}
