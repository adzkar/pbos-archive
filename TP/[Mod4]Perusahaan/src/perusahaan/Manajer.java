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
public class Manajer extends Karyawan {
    private Karyawan staff[] = new Karyawan[10];
    private int jumlahKaryawan = 0, golongan;
    public Manajer(String nama, double gaji, int golongan) {
        super(nama, gaji);
        Karyawan k = new Karyawan(nama, gaji);
        if(golongan == 1 || golongan == 2 || golongan == 3) {
            this.golongan = golongan;
        } else {
            this.golongan = 1;
        }
    }

    public void setGolongan(int golongan) {
        if(golongan == 1 || golongan == 2 || golongan == 3) {
            this.golongan = golongan;
        } else {
            this.golongan = 1;
        }
    }
    
    public void setKinerja(int n) {
        super.setKinerja(n);
    }

    public Karyawan getStaff(int id) {
        return this.staff[id];
    }

    public int getGolongan() {
        return golongan;
    }
    
    public double getGaji() {
        double tunjangan;
        if(this.golongan == 1) {
            tunjangan = 1500000;
        } else if(this.golongan == 2) {
            tunjangan = 2000000;
        } else {
            tunjangan = 3000000;
        }
        return super.getGaji() + tunjangan;
    }
    
    public void addStaff(Karyawan k) {
        this.staff[this.jumlahKaryawan] = k;
        this.jumlahKaryawan++;
//        System.out.println("dari function karyawan");
    }
    
//    tambahan

    public int getJumlahKaryawan() {
        return jumlahKaryawan;
    }
    
}
