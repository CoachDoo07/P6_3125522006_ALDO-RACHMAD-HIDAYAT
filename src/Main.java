public class Main {
    public static void main(String[] args) {
 
        // ===== Setup: Kamar & Kos =====
        Kamar kamar1 = new Kamar("K01", "Single", true);
 
        Kos kos = new Kos("Kos Sejahtera");
        kos.tambahKamar(kamar1);                       // overload 1: object Kamar
        kos.tambahKamar("K02", "Double", true);        // overload 2 (Method Overloading): data mentah
 
        System.out.println("--- Method Overloading: dua versi tambahKamar() ---");
        kos.tampilkanDaftarKamar();
        System.out.println();
 
        // ===== Upcasting: reference superclass untuk object subclass =====
        System.out.println("--- Upcasting: Pengguna sebagai reference ---");
        Pengguna pengguna1 = new PemilikKos("PK01", "Haidar", "0812-3456-7890", kos);
        Pengguna pengguna2 = new Penyewa("P01", "Budi", kamar1, "2026-10-01");
        Pengguna pengguna3 = new Penyewa("P02", "Siti", kamar1, "2026-10-15");
        System.out.println("Ketiga variabel di atas bertipe Pengguna, tapi object aslinya berbeda-beda.");
        System.out.println();
 
        // ===== Polymorphic Collection + Dynamic Binding =====
        System.out.println("--- Polymorphic Collection: satu method, perilaku berbeda-beda ---");
        Pengguna[] daftarPengguna = { pengguna1, pengguna2, pengguna3 };
 
        for (Pengguna p : daftarPengguna) {
            System.out.print(p.getNama() + " (" + p.getClass().getSimpleName() + ") -> ");
            p.tampilkanPeran(); // Dynamic Binding: method yang jalan sesuai object asli
        }
        System.out.println();
 
        // ===== Bukti Dynamic Binding lebih eksplisit =====
        System.out.println("--- Tabel Pengujian Dynamic Binding ---");
        Pengguna refPemilik = pengguna1; // reference bertipe Pengguna, object asli PemilikKos
        Pengguna refPenyewa = pengguna2; // reference bertipe Pengguna, object asli Penyewa
 
        System.out.print("Reference Pengguna, object aktual PemilikKos -> ");
        refPemilik.tampilkanPeran();
 
        System.out.print("Reference Pengguna, object aktual Penyewa    -> ");
        refPenyewa.tampilkanPeran();
    }
}