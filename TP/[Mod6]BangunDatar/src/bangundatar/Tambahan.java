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
public class Tambahan {
    public void showShape(Shape s) {
        if(s.getClass().getName() == "bangundatar.Square")
            System.out.println("Persegi");
        else if (s.getClass().getName() == "bangundatar.Circle")
            System.out.println("Lingkaran");
//        switch(s.getClass().getName()) {
//            case "bangundatar.Square": System.out.println("Persegi");
//                 break;
//            case "bangundatar.Circle": System.out.println("Lingkaran");
//                break;
//        }
    }
}
