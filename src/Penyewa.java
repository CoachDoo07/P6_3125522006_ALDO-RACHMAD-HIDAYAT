public class Penyewa extends Pengguna {
    private Kamar kamar;      // Association: referensi ke object Kamar
    private Tagihan tagihan;  // Composition: dibuat sendiri oleh Penyewa
 
    public Penyewa(String id, String nama, Kamar kamar, String jatuhTempo) {
        super(id, nama);
        System.out.println("Constructor Penyewa dijalankan");
        setKamar(kamar);
        this.tagihan = new Tagihan(id + "-TGH", jatuhTempo);
    }
 
    public Kamar getKamar() {
        return kamar;
    }
 
    public Tagihan getTagihan() {
        return tagihan;
    }
 
    public void setKamar(Kamar kamar) {
        if (kamar != null) {
            this.kamar = kamar;
        } else {
            System.out.println("Kamar tidak valid");
        }
    }
 
    // Method Overriding: perilaku berbeda dari superclass
    @Override
    public void tampilkanPeran() {
        System.out.println("Penyewa - menempati kamar dan membayar tagihan sewa");
    }
 
    public void tampilkanData() {
        System.out.println("=== Data Penyewa ===");
        tampilkanInfo();
        System.out.println("Nomor Kamar : " + kamar.getNomorKamar());
        System.out.println("--------------------");
    }
}