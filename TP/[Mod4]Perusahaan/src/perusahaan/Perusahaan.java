/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perusahaan;

/**
 *
 * @author tayo
 */
public class Perusahaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manajer bobby = new Manajer("Bobby", 7500000, 2);
        bobby.setKinerja(87);
        System.out.println("Manajer");
        System.out.println("Nama: "+bobby.getNama());
        System.out.println("Gaji: "+bobby.getGaji());
        System.out.println("Golongan: "+bobby.getGolongan());
        bobby.addStaff(new Karyawan("alex", 5000000));
        bobby.addStaff(new Karyawan("ruby", 4500000));
        bobby.addStaff(new Karyawan("suzy", 5250000));
        bobby.addStaff(new Karyawan("ben", 4750000));
        bobby.addStaff(new Karyawan("max", 5500000));
        for (int i = 0; i < bobby.getJumlahKaryawan(); i++) {
            System.out.println("Nama: "+bobby.getStaff(i).getNama()+" Gaji: "+bobby.getStaff(i).getGaji());
        }
    }
    
}
