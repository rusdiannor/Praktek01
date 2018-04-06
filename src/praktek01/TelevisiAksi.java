/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author proWindows8.1
 */
public class TelevisiAksi {
    public static void main(String[] args) {
        Televisi LG = new Televisi ();
        Televisi Toshiba = new Televisi ();
        Televisi Sharp = new Televisi ();
        
        LG.merk="LG";
        LG.warna="Hitam";
        LG.ukuran="32inc";
        LG.jenis="Slim";
        LG.kelebihan="Multemedia";
        
        Toshiba.merk="Toshiba";
        Toshiba.warna="Putih";
        Toshiba.ukuran="24inc";
        Toshiba.jenis="Tabung";
        Toshiba.kelebihan="Multemedia";
        
        Sharp.merk="Sharp";
        Sharp.warna="Hitam";
        Sharp.ukuran="32inc";
        Sharp.jenis="Slim";
        Sharp.kelebihan="HDMI";
        
        LG.cetakInfo();
        Toshiba.cetakInfo();
        Sharp.cetakInfo();
        
   
    }
    
}
