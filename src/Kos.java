import java.util.ArrayList;
import java.util.List;
 
public class Kos {
    private String namaKos;
    private List<Kamar> daftarKamar; // Aggregation: kamar dibuat di luar class Kos
 
    public Kos(String namaKos) {
        this.namaKos = namaKos;
        this.daftarKamar = new ArrayList<>();
    }
 
    public String getNamaKos() {
        return namaKos;
    }
 
    // Overload 1: menambahkan kamar yang objectnya sudah dibuat sebelumnya
    public void tambahKamar(Kamar kamar) {
        daftarKamar.add(kamar);
    }
 
    // Overload 2 (Method Overloading): menambahkan kamar langsung dari data mentah,
    // tanpa perlu membuat object Kamar secara manual di luar. Nama method sama,
    // parameter berbeda (String, String, boolean) -> ini contoh overloading.
    public void tambahKamar(String nomorKamar, String tipeKamar, boolean statusTersedia) {
        Kamar kamarBaru = new Kamar(nomorKamar, tipeKamar, statusTersedia);
        daftarKamar.add(kamarBaru);
    }
 
    public void tampilkanDaftarKamar() {
        System.out.println("=== Daftar Kamar di " + namaKos + " ===");
        for (Kamar k : daftarKamar) {
            k.tampilkanData();
        }
    }
 
    public int jumlahKamarTersedia() {
        int jumlah = 0;
        for (Kamar k : daftarKamar) {
            if (k.isStatusTersedia()) {
                jumlah++;
            }
        }
        return jumlah;
    }
}