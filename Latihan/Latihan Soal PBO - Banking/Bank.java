/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */

public class Bank {
     
    private String nama;
    private String[] daftarNasabah;
    private int jumlahNasabah;
    private Rekening[] daftarRekening;
    private int jumlahRekening;
    private Transaksi[] daftarTransaksi;
    private int jumlahTransaksi;     

    
    /*
    Constructor Bank(nama:String, maxJumlahNasabah:int, maxJumlahTransaksi:int) 
    membuat obyek Bank dan memberi nilai pada atribut nama, menginisiasi array 
    daftarNasabah dengan ukuran maxJumlahNasabah, array daftarRekening dengan 
    ukuran 5 x maxJumlahNasabah, array daftarTransaksi dengan ukuran maxJumlahTransaksi
    */
    public Bank(String nama, int maxJumlahNasabah, int maxJumlahTransaksi) {
        this.nama = nama;        
        this.daftarNasabah = new String[maxJumlahNasabah];        
        this.daftarRekening = new Rekening[maxJumlahNasabah * 5];
        this.daftarTransaksi = new Transaksi[maxJumlahTransaksi];                               
    }

    public String getNama() {
        return nama;
    }
    
    public void tambahNasabah(String nasabah){
        this.daftarNasabah[this.jumlahNasabah] = nasabah;
        this.jumlahNasabah++;
        
    }
    
    
    /*
    -	buatRekening(idxNasabah:int, noRek:int, saldo:double) membuat 
    obyek rekening baru dengan syarat saldo lebih dari 500.000. 
    Parameter nama nasabah diambil dari daftar nasabah pada posisi index ke-idxNasabah. 
    Obyek Rekening yang dibuat ditambahkan ke daftar rekening
    */
    public void buatRekening(int idxNasabah, int noRek, double saldo){
        if(saldo > 500000){
            String nama = this.daftarNasabah[idxNasabah];            
            this.daftarRekening[this.jumlahRekening] = new Rekening(nama, noRek, saldo);                        
            this.jumlahRekening++;
        }
    }    
    
    
    public void tambahTransaksi(int jenisTransaksi, double jumlah, Rekening rek){
       if((jenisTransaksi == 0) && (jumlah <= rek.getSaldo())){  // 
            Transaksi t = new Transaksi(rek.getNoRek(), jenisTransaksi, jumlah);
            this.daftarTransaksi[this.jumlahTransaksi] = t;
            rek.tarikUang(jumlah);
        }else if((jenisTransaksi == 1)){                               
            Transaksi t = new Transaksi(rek.getNoRek(), jenisTransaksi, jumlah);
            this.daftarTransaksi[this.jumlahTransaksi] = t;
            rek.setorUang(jumlah);
        }
        this.jumlahTransaksi++;
    }    
    
    public Rekening getRekening(int i){
        return this.daftarRekening[i];
    }
    

    public int getJumlahRekening() {
        return jumlahRekening;
    }

    public int getJumlahTransaksi() {
        return jumlahTransaksi;
    }
        
    
    

    

    
    public Transaksi getTransaksi(int i){
        return this.daftarTransaksi[i];
    }
    
    public void display(){
        System.out.println("Daftar Rekening Bank BNI");
        for (int i = 0; i <= this.jumlahNasabah; i++ ) {
            System.out.println((i+1)+".  Nama : " + this.daftarRekening[i].getNasabah());
            System.out.println(     "    No. rek : " + this.daftarRekening[i].getNoRek());
            System.out.println(     "    Saldo : " + this.daftarRekening[i].getSaldo());            
            System.out.println(     "    Daftar Transaksi : ");
            int num = 1;
            for (int j = 0; j < this.jumlahTransaksi; j++) {                
                if (this.daftarRekening[i].getNoRek() == this.daftarTransaksi[j].getNoRek()){                       
                    System.out.println("    "+(num)+". Jenis Transaksi : " + this.daftarTransaksi[j].getJenis());
                    System.out.println(       "       Sebesar : " + this.daftarTransaksi[j].getJumlah());
                    num++;
                }
                
            }
        }
    }

}
