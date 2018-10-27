/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Transaksi {
    private int noRek;
    private int jenis; //0 untuk penarikan dan 1 untuk penyetoran
    private double jumlah;

    public Transaksi(int noRek, int jenis, double jumlah) {
        this.noRek = noRek;
        this.jenis = jenis;
        this.jumlah = jumlah;
    }

    public int getNoRek() {
        return noRek;
    }

    public String getJenis() {
        String jenis;
        if (this.jenis == 0){
            jenis = "penarikan";
        }else{
            jenis = "penyetoran";
        }
        return jenis;
       
    }

    public double getJumlah() {
        return jumlah;
    }
    
    
    
    
    
}
