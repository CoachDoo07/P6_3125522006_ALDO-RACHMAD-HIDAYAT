public class PemilikKos extends Pengguna {
    private String nomorTelepon;
    private Kos kos; // Association: pemilik mengelola satu object Kos
 
    public PemilikKos(String id, String nama, String nomorTelepon, Kos kos) {
        super(id, nama);
        System.out.println("Constructor PemilikKos dijalankan");
        setNomorTelepon(nomorTelepon);
        this.kos = kos;
    }
 
    public String getNomorTelepon() {
        return nomorTelepon;
    }
 
    public Kos getKos() {
        return kos;
    }
 
    public void setNomorTelepon(String nomorTelepon) {
        if (nomorTelepon != null && !nomorTelepon.isBlank()) {
            this.nomorTelepon = nomorTelepon;
        } else {
            System.out.println("Nomor telepon tidak valid (tidak boleh kosong)");
        }
    }
 
    // Method Overriding: perilaku berbeda dari superclass dan dari Penyewa
    @Override
    public void tampilkanPeran() {
        System.out.println("Pemilik Kos - mengelola data kamar dan memantau penyewa");
    }
 
    public void tampilkanData() {
        System.out.println("=== Data Pemilik Kos ===");
        tampilkanInfo();
        System.out.println("No. Telepon : " + nomorTelepon);
        System.out.println("Mengelola   : " + kos.getNamaKos());
        System.out.println("------------------------");
    }
}