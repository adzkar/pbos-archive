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
public class BangunDatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Square persegi = new Square(10);
        System.out.println("Luas Persegi adalah "+persegi.hitungLuas());
        Circle lingkaran = new Circle(7);
        System.out.println("Luas Lingkaran adalah "+lingkaran.hitungLuas());
        
        Tambahan t = new Tambahan();
        t.showShape(lingkaran);
        t.showShape(persegi);
    }
    
}
