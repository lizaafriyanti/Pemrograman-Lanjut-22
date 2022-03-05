/*
 * Pemrograman Lanjut Menggunakan Bahasa Pemrograman Java
 * Liza Afriyanti, M.Kom
 */


public class Mobil {
    String noPolisi;
    String model;
    int tahunProduksi;
    
    //konstruktor tanpa parameter
    public Mobil(){
        noPolisi = "Tidak terdaftar";
        model = "Tidak teridentifikasi";
    }
    
    //konstruktor dengan parameter
    public Mobil(String nopol, String mdl, int tahun){
        noPolisi = nopol;
        model = mdl;
        tahunProduksi = tahun;
    }
    
    //method void, tidak mengembalikan nilai
    public void setNomorPolisi(String nopol, String mdl, int thn){
        noPolisi = nopol;
        model = mdl;
        tahunProduksi = thn;
    }
    
    //method non-void, method yang mengembalikan nilai
    String cetakInformasi(){
        return "Nomor Polisi : " + noPolisi + "\nModel : " + model + 
                "\nTahun Produksi : " + tahunProduksi;
    }
}
