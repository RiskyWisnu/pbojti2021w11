/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan;

/**
 *
 * @author Risky
 */
public class Sarjana extends Mahasiswa implements ICumlaude,IBerprestasi{
    
    public Sarjana (String nama){
        super(nama);
    }

    
    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3.51"); 
    }

    @Override
    public void kuliahDiKampus() {
       System.out.println("Aku mahasiswa , namaku " + this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }
    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi NASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal NASIONAL");
    }
}
