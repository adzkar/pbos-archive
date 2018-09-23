/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Tester {
    public static void main(String[] args) {
        Bank bank =  new Bank("Amal", 4, 50);
                        
        bank.tambahNasabah("roro");
        bank.tambahNasabah("shisi");
        bank.tambahNasabah("ucup");
 
        //roro
        bank.buatRekening(0, 13120040, 1000000);
        bank.buatRekening(0, 13120041, 1500000);
        
        //shisi
        bank.buatRekening(1, 13120044, 650000);
        
        
        //ucup
        bank.buatRekening(2, 13120042, 850000);
                
        
        bank.tambahTransaksi(0, 940000, bank.getRekening(0));
        bank.tambahTransaksi(1, 45000, bank.getRekening(1));
        bank.tambahTransaksi(1, 10000, bank.getRekening(2));
        bank.tambahTransaksi(0, 90000, bank.getRekening(2));
        bank.tambahTransaksi(0, 800000, bank.getRekening(3));
        
        
        
        bank.display();
        
        
    }
    
}
