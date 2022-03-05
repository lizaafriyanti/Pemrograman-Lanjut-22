/*
 * Pemrograman Lanjut Menggunakan Bahasa Pemrograman Java
 * Liza Afriyanti, M.Kom
 */


public class DemoMobil {
    public static void main(String[] args) {
       Mobil ToyotaAvanza;
       
       ToyotaAvanza = new Mobil();
       
       //pemanggilan method void
       ToyotaAvanza.setNomorPolisi("A 1234 BB", "Veloz", 2019);
       
       //pemanggilan method non-void
       String infoMobil = ToyotaAvanza.cetakInformasi();
       System.out.println(infoMobil);
    }
}
