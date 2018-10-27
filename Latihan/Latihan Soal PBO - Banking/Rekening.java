/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Rekening {
    private String nasabah;
    private int noRek;
    private double saldo;
    private Transaksi[] daftarTransaksi;
    private int jumlahTransaksi;

    public Rekening(String nasabah, int noRek, double saldo) {
        this.nasabah = nasabah;
        this.noRek = noRek;
        this.saldo = saldo;
        this.daftarTransaksi = new Transaksi[100];
    }
        
    

    public String getNasabah() {
        return nasabah;
    }

    public int getNoRek() {
        return noRek;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void tarikUang(double x){
        this.saldo -= x;        
        this.daftarTransaksi[this.jumlahTransaksi] = new Transaksi(this.noRek, 0, x);
        this.jumlahTransaksi++;
    }

    public void setorUang(double x){
        this.saldo += x;        
        this.daftarTransaksi[this.jumlahTransaksi] = new Transaksi(this.noRek, 1, x);
        this.jumlahTransaksi++;
    }    
    
    public Transaksi getTransaksi(int i){
        return this.daftarTransaksi[i];
    }

    public int getJumlahTransaksi() {
        return jumlahTransaksi;
    }
    
    
}
