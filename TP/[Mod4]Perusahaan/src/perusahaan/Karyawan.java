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
class Karyawan {
    private String nama;
    private double gaji;
    private int kinerja;

    public Karyawan(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        if(this.kinerja > 85) {
            this.gaji = gaji + (10/100*gaji);
        } else if (this.kinerja < 40) {
            this.gaji = gaji - (15/100*gaji);
        } else {
            this.gaji = gaji;
        }
    }

    public void setKinerja(int kinerja) {
        this.kinerja = kinerja;
    }

    public int getKinerja() {
        return kinerja;
    }
    
    
    
}
